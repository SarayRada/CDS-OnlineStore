class ShoppingCart(){
    private var shoppingCart = mutableListOf<Product>()
    fun addAProductToTheCart(product: Product){
        shoppingCart.add(product)
    }
    fun calculatePriceOfProduct(product:Product):Double{
        val multiply = howManyOfThisProduct(product.productReference)
        return product.productPrice * multiply
    }
    fun seeProductSummary():String{
        return shoppingCart.last().productDescription
    }
    fun calculateTotal():Double{
        var total = 0.0
        for (product in shoppingCart.distinctBy { it.productReference }){
            total += calculatePriceOfProduct(product)
        }
        return total
    }
    fun seeMyCart(): List<Product>{
        return shoppingCart.distinctBy { it.productReference }
    } // filtrar los que tienen la misma referencia
    fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        for (product in shoppingCart){
            if (product.productReference == reference) cantidad ++
        }
        return cantidad
    }
}