class OnlineStore(private var storeQueries: StoreQueries, private var screen: Screen, private var shoppingCart: ShoppingCart){
    private fun nextStep(step: String){
        when(step){
            "1" -> {
                shoppingCart.addAProductToTheCart(storeQueries.productToShow)
                screen.showProductSumary(shoppingCart.seeProductSummary())
                shoppingCart.calculateTotal()
                nextStep(screen.askForCatalogueNextStep())
            }
            "2" -> showProducts()
            "3" -> {
                val reference = screen.askForAProduct()
                val product:Product? = storeQueries.showProduct(reference)
                val howManyOfAProduct = storeQueries.showHowManyOfThisProduct(reference)
                screen.showProductInformation(product, howManyOfAProduct)
                nextStep(screen.askForProductNextStep())
            }
            "4" -> {
                screen.showShoppingCart(shoppingCart)
                nextStep(screen.askForCheckout())
            }
        }
    }
    fun showProducts(){
        screen.showProducts(storeQueries.showStoreLowerThan(screen.askForProductsLowerThan()))
        this.nextStep(screen.askForCatalogueNextStep())
    }
}