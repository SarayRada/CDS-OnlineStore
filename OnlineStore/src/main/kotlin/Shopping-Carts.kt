class ShoppingCart(){
    var shoppingCart = mutableListOf<Product>()
        private set
    fun addAProductToTheCart(product: Product){
        shoppingCart.add(product)
    }
    fun calculateTotal():Double{
        var total = 0.0
        for (product in shoppingCart.distinctBy { it.productReference }){
            total += calculatePriceOfProduct(product)
        }
        return total
    }
    fun calculatePriceOfProduct(product:Product):Double{
        val multiply = howManyOfThisProduct(product.productReference)
        return product.productPrice * multiply
    }
    fun seeProductSummary():String{
        return shoppingCart.last().productDescription
    }
    fun seeMyCart(): List<Product>{
        return shoppingCart.distinctBy { it.productReference }
    }
    fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        for (product in shoppingCart){
            if (product.productReference == reference) cantidad ++
        }
        return cantidad
    }
}