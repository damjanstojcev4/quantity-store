let url = "http://localhost:1010/linkesti/"

let init = {
    mode: 'cors',
    method: 'get',
    headers: {
       'Content-Type': 'application/json; charset=UTF-8',
    }
 };

// Function to create and populate the table
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

// Load data using fetch
fetch(url)
    .then(response => response.json())
    .then(data => createTable(data))
    .catch(error => console.error('Error fetching data:', error));


const editButtons = document.querySelectorAll('.editButtonHome');
editButtons.forEach(button => {
    button.addEventListener('click', function() {
        // Handle edit button click here
        // For example, you can open a modal for editing
        // or navigate to a dedicated edit page.
    });
});
