class StoreQueries (private var productStore:ProductStore){
    private val stock get() = productStore.stock
    fun getAProduct(reference: String): Product?{
        return try {
           stock.first { it.productReference == reference }
        } catch (ex: NoSuchElementException) {
            println("That product doesn't exist")
            null
        }
    }
    fun getTheAmountOfAProduct(reference: String):Int{
        return stock.count {it.productReference == reference}
    }
    fun getProductsBelowAPrice(price:Double):List<Product>{
        return stock.filter { it.productPrice <= price }
            .distinctBy { it.productReference }
        }
   }