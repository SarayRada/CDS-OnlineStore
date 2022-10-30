class ShoppingCart(){
    var shoppingCart = mutableListOf<Product>()
        private set
    fun addAProductToTheCart(product: Product?){
        if (product != null) shoppingCart.add(product)
    }
    fun calculateTotal():Double{
        var total = 0.0
        for (product in shoppingCart.distinctBy { it.reference }){
            total += calculatePriceOfProduct(product)
        }
        return total
    }
    fun calculatePriceOfProduct(product:Product):Double{
        val multiply = howManyOfThisProduct(product.reference)
        return product.price * multiply
    }
    fun seeProductSummary():String{
        return shoppingCart.last().description
    }
    fun seeMyCart(): List<Product>{
        return shoppingCart.distinctBy { it.reference }
    }
    fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        for (product in shoppingCart){
            if (product.reference == reference) cantidad ++
        }
        return cantidad
    }
}