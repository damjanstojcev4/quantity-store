document.addEventListener("DOMContentLoaded", function() {
    const addItemButton = document.getElementById("addItemButton");
    addItemButton.addEventListener("click", addItem);
});

function addItem() {
    const itemName = document.getElementById("itemName").value;
    const itemDescription = document.getElementById("itemDescription").value;
    const itemPrice = parseFloat(document.getElementById("itemPrice").value);
    const itemQuantity = parseInt(document.getElementById("itemQuantity").value);

    const itemData = {
        name: itemName,
        description: itemDescription,
        price: itemPrice,
        quantity: itemQuantity
    };

    fetch("/api/addItem", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(itemData)
    })
    .then(response => response.json())
    .then(data => {
        alert("Item added successfully!");
        // Clear form fields
        document.getElementById("addItemForm").reset();
    })
    .catch(error => {
        console.error("Error adding item:", error);
        alert("Failed to add item. Please try again.");
    });
}
