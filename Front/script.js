let url = "http://localhost:1010/linkesti/"

let init = {
    mode: 'cors',
    method: 'get',
    headers: {
       'Content-Type': 'application/json; charset=UTF-8',
    }
 };

function createTable(data) {
    const tableBody = document.getElementById('table-body');

    data.forEach(item => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.articleName}</td>
            <td>${item.sku}</td>
            <td>${item.quantity}</td>
        `;
        tableBody.appendChild(row);
    });
}

fetch(url)
    .then(response => response.json())
    .then(data => createTable(data))
    .catch(error => console.error('Error fetching data:', error));

function loadOneSku(event) {
        if (event.key == 'Enter') {
            event.preventDefault();
    
            let skuInput = document.getElementById("sku");
            let sku = skuInput.value;
            
            console.log(url + sku);
    
            fetch(url + sku)
                .then(response => response.json())
                .then(json => {
                    prepareArticle(json);
                    createTable(json);
                })
                .catch(error => {
                    console.error("Error fetching SKU:", error);
                });
        }
}

function prepareArticle(json) {
    document.getElementById("article").value = json.articleName;
    document.getElementById("sku").value = json.sku;
    document.getElementById("quantity").value = json.quantity;
    
    item = {
       articleName: json.articleName,
       sku: json.sku,
       quantity: json.quantity
    }
 }