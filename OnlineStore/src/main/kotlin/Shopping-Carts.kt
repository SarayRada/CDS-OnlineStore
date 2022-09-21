class ShoppingCart(){
    private var shoppingCart = mutableListOf<Product>()
    fun addAProductToTheCart(product: Product){
        shoppingCart.add(product)
    }
    fun calculatePriceOfProduct(product:Product):Double{
        val multiply = howManyOfThisProduct(product.showProductReference())
        return product.showProductPrice() * multiply
    }
    fun seeProductSummary():String{
        return shoppingCart.last().showProductDescription()
    }
    fun calculateTotal():Double{
        var total = 0.0
        for (product in shoppingCart){
            total += calculatePriceOfProduct(product)
        }
        return total
    }
    fun seeMyCart(): MutableList<Product>{
        return shoppingCart
    }
    private fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        for (product in shoppingCart){
            if (product.showProductReference() == reference) cantidad ++
        }
        return cantidad
    }
}