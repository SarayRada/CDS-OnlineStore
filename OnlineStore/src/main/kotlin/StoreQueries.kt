class StoreQueries (private var productStore:ProductStore){
    fun getAProduct(reference: String): Product?{
        for (product in productStore.productsStore) {
            if (reference == product.productReference) {
                return product
            }
        }
        println("That product doesn't exist")
        return null
    }
    fun getTheAmountOfAProduct(reference: String):Int{
        var cantidad = 0
        // ¿por qué no puedo poner un private set? --> está dentro de una función
        for (product in productStore.productsStore){
            if (product.productReference == reference) cantidad ++
        }
        return cantidad
    }
    fun getProductsBelowAPrice(price:Double):List<Product>{
        return productStore.productsStore.filter { it.productPrice <= price }.distinctBy { it.productReference }
        }
   }