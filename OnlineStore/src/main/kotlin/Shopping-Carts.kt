class ShoppingCart(){
    val cart = mutableListOf<Product>()
    fun addAProductToTheCart(product: Product){
        cart.add(product)
    }
    fun getLastProductAdded():Product{
        return cart.last()
    }
}

