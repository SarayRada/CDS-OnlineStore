class ShoppingCart(){
    private val productsInCart = mutableListOf<Product>()
    fun addAProductToTheCart(product: Product) {
        productsInCart.add(product)
    }
    fun getLastProductReferenceAdded():Reference{
        return productsInCart.last().reference
    }
    fun getProductsDifferentReference():List<Product>{
        return productsInCart.distinctBy { it.reference.value }
    }
    fun getUnitsByReference(reference:Reference):Int {
        return productsInCart.count { it.reference.value == reference.value }
    }
    fun calculateSubtotal(price: Price, reference: Reference):Double{
        return (price.value) * productsInCart.count { it.reference.value == reference.value }
    }
    fun totalOfShopping():Double{
        return productsInCart.sumOf { it.price.value }
    }
}

