let url = "http://localhost:1010/linkesti/"
let url1 = "http://localhost:1010/linkesti/add"
let ur2 = "http://localhost:1010/linkesti/download-excel"
let url3 = "http://localhost:1010/linkesti/update"

let init = {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json; charset=UTF-8',
    },
    mode: 'cors', // Optional, add this if it's a cross-origin request
  };
  
function createTable(data) {
    const tableBody = document.getElementById('table-body');

    data.forEach(item => {
        const row = document.createElement('tr');
        row.id= item.sku;
        row.innerHTML = `
            <td>${item.articleName}</td>
            <td>${item.sku}</td>
            <td>${item.price}</td>
            <td>${item.quantity}</td>
            <td><button onclick="clickButton(${item.quantity},'${item.articleName}', ${item.sku})">Edit</button></td>
        `;
        tableBody.appendChild(row);
    });
}


fetch(url)
    .then(response => response.json())
    .then(data => createTable(data))
    .catch(error => console.error('Error fetching data:', error));

function prepareTableRow({articleName, sku, price,quantity}) {
        let newRow = document.createElement("tr");
        newRow.id = sku;
        newRow.innerHTML = `
            <td>${articleName}</td>
            <td>${sku}</td>
            <td>${price}</td>
            <td>${quantity}</td>
            <td><button onclick="clickButton(${quantity},'${articleName}',${sku})">Edit</button></td>
        `;
        
        document.getElementById("table-body").innerHTML = ""; // Clear existing rows
        document.getElementById("table-body").appendChild(newRow);
}
    
function loadOneSku(event) {
        if (event.key == 'Enter') {
            event.preventDefault();
    
            let skuInput = document.getElementById("sku");
            let sku = skuInput.value;
    
            console.log(url + sku);
    
            fetch(url + sku)
                .then(response => response.json())
                .then(json => {
                    prepareTableRow(json);
                })
                .catch(error => {
                    console.error("Error fetching SKU:", error);
                });
        }
     
        if(event.target.value==''){
            document.getElementById("table-body").innerHTML = ""
            fetch(url)
    .then(response => response.json())
    .then(data => createTable(data))
    .catch(error => console.error('Error fetching data:', error));
        }
}

function prepareArticle(json) {
        document.getElementById("articleName").textContent = json.articleName;
        document.getElementById("sku").value = json.sku;
        document.getElementById("price").value = json.price;
        document.getElementById("quantity").textContent = json.quantity;  
    
    item = {
       articleName: json.articleName,
       sku: json.sku,
       price: json.price,
       quantity: json.quantity
    }
 }

 function addItem() {
    //const item = getFormData();
    // item.articleName = [{ id: document.getElementById("articleName").value }]
    // item.sku = [{ id: document.getElementById("sku").value }]
    // item.quantity = [{ id: document.getElementById("quantity").value }]
 
    init.method = 'post';

    const articleData = {
        "articleName": document.getElementById("articleName").value,
        "sku": document.getElementById("sku").value,
        "price": document.getElementById("price").value,
        "quantity": document.getElementById("quantity").value
    }
 
    init.body = JSON.stringify(articleData);
    fetch(url1, init).then(() => console.log("Success"));
 }

 function downloadExcel() {
    fetch(ur2)
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(blob);
            const a = document.createElement('a');
            a.href = url;

            const currentDate = new Date();
            const formattedDate = `${currentDate.getDate()}-${currentDate.getMonth() + 1}-${currentDate.getFullYear()}`;
            const encodedFileName = `MesecenPopis_${formattedDate}.xlsx`;

            a.download = encodedFileName;
            a.click();
            window.URL.revokeObjectURL(url);
        })
        .catch(error => {
            console.error('Error downloading Excel:', error);
        });
}

const updateButton = document.getElementById("updateBtn");
const cancelButton = document.getElementById("cancel");
const dialog = document.getElementById("favDialog");
dialog.returnValue = "favAnimal";

let globalSku = null;

function openCheck(dialog) {
  if (dialog.open) {
    console.log("Dialog open");
  } else {
    console.log("Dialog closed");
  }
}


function clickButton(quantity, name, sku){
    dialog.showModal();
    openCheck(dialog);
    document.querySelector(
'#counter'
    ).value= quantity;
    console.log(sku)
    globalSku=sku;
}

// Form cancel button closes the dialog box
cancelButton.addEventListener("click", () => {
  dialog.close("Cancel");
  openCheck(dialog);
});

updateButton.addEventListener('click',(e)=>{
    e.preventDefault()
    const quantity = document.querySelector('#counter').value;

    //make fetch request here


    //if request success update value
    const apiUrl = `http://localhost:1010/linkesti/update?sku=${globalSku}&quantity=${quantity}`;

    fetch(apiUrl, {
        method: 'PUT'
    })
        .then(response => {
            if (response.ok) {
                return response.text();
            } else {
                throw new Error('Fetch request failed:', response.status, response.statusText);
            }
        })
        .then(responseText => {
            // Fetch request successful
            document.getElementById(globalSku.toString()).getElementsByTagName('td')[3].innerText = quantity;
            dialog.close("Cancel");
        })
        .catch(error => {
            console.error('An error occurred:', error);
        });

});
