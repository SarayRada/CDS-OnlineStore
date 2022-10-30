class OnlineStore(private var storeQueries: StoreQueries, private var screen: Screen, private var shoppingCart: ShoppingCart){
    private fun nextStep(step: String){
        when(step){
            "1" -> {
                addAProductToCart()
                showProductSummary()
            }
            "2" -> showProducts()
            "3" -> showProductInformation()
            "4" -> showShoppingCart()
        }
    }
    private fun showShoppingCart() {
        screen.showShoppingCart(shoppingCart)
        nextStep(screen.askForCheckout())
    }
    private fun showProductInformation() {
        val reference = screen.askForAProductToExplore()
        val product: Product? = storeQueries.getAProduct(reference)
        val howManyOfAProduct = storeQueries.getTheAmountOfAProduct(reference)
        screen.showProductInformation(product, howManyOfAProduct)
        nextStep(screen.askForProductNextStep())
    }
    private fun addAProductToCart() {
        val reference = screen.askForAProductReference()
        val productToShow = storeQueries.getAProduct(reference)
        shoppingCart.addAProductToTheCart(productToShow)
    }
    private fun showProductSummary() {
        val productSummary = shoppingCart.seeProductSummary()
        screen.showProductSumary(productSummary)
        nextStep(screen.askForCatalogueNextStep())
    }

    fun showProducts(){
        val price = screen.askForProductsLowerThan()
        val productsBelowAPrice = storeQueries.getProductsBelowAPrice(price)
        screen.showProducts(productsBelowAPrice)
        val nextStep = screen.askForCatalogueNextStep()
        this.nextStep(nextStep)
    }
}