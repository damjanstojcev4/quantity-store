#Linkesti
## quantity-store

**#GET** ##Get All Items
localhost:1010/linkesti/

**#POST** ##Add Item
localhost:1010/linkesti/add
##Body 
{
    "articleName": "Socks",
    "sku": 66425,
    "price": 3000,
    "quantity": 50
}

**#PUT** ##Update
localhost:1010/linkesti/update?sku=11001&quantity=100
## Query Params
sku=11001
quantity=100

**#GET** ##Get By SKU
localhost:1010/linkesti/33335

**#DELETE**
localhost:1010/linkesti/delete/44444

**#GET** ##Download Excel
http://localhost:1010/linkesti/download-excel
