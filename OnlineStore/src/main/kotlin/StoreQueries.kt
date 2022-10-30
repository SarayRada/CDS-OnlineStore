class StoreQueries (private var productStore:ProductStore){
    private val stock get() = productStore.stock
    fun getAProduct(reference: String): Product?{
        return try {
           stock.first { it.reference == reference }
        } catch (ex: NoSuchElementException) {
            println("That product doesn't exist")
            null
        }
    }
    fun getTheAmountOfAProduct(reference: String):Int{
        return stock.count {it.reference == reference}
    }
    fun getProductsBelowAPrice(price:Double):List<Product>{
        return stock.filter { it.price <= price }
            .distinctBy { it.reference }
        }
   }