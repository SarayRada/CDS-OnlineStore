class Store (private var dataStore:DataStore){
    var productToShow:Product =Product("", "", "", "", 0.0, "")
        private set
    fun showProduct(reference: String): Product?{
        try {
            for (product in dataStore.productsStock) {
                if (reference == product.productReference) {
                    productToShow = product
                    return product
                }
            }
        } finally {
           println("Product doesn't exist")
        }
       return null
    }
    fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        // ¿por qué no puedo poner un private set? --> está dentro de una función
        for (product in dataStore.productsStock){
            if (product.productReference == reference) cantidad ++
        }
        return cantidad
    }
    fun showStoreLowerThan(price:Double):List<Product>{
        return dataStore.productsStock.filter { it.productPrice <= price }.distinctBy { it.productReference }
        }
   }