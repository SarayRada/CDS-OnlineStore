class OnlineStore(
    private val storeQueries: StoreQueries,
    private val informationScreen: InformationScreen,
    private val questionMaker: QuestionMaker,
    private val shoppingCart: ShoppingCart){
    private fun nextStep(step: String) {
        when(step) {
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
        val cart = shoppingCart
        informationScreen.showShoppingCart(cart)
        nextStep(questionMaker.askForCheckout())
    }
    private fun showProductInformation() {
        val reference = questionMaker.askForAProductToExplore()
        val product: Product? = storeQueries.getAProduct(reference)
        val howManyOfAProduct = storeQueries.getTheAmountOfAProduct(reference)
        informationScreen.showProductInformation(product, howManyOfAProduct)
        nextStep(questionMaker.askForProductNextStep())
    }
    private fun addAProductToCart() {
        val reference = questionMaker.askForAProductReference()
        val productToShow = storeQueries.getAProduct(reference)
        if (productToShow != null) {
            shoppingCart.addAProductToTheCart(productToShow)
        } else {
            informationScreen.showNoProductErrorMessage()
        }
    }
    private fun showProductSummary() {
        val summary = shoppingCart.getLastProductReferenceAdded()
        informationScreen.showProductSummary(summary.value)
        nextStep(questionMaker.askForCatalogueNextStep())
    }
    fun showProducts(){
        val price = questionMaker.askForProductsLowerThan()
        val productsBelowAPrice = storeQueries.getProductsBelowAPrice(price)
        informationScreen.showProducts(productsBelowAPrice)
        val nextStep = questionMaker.askForCatalogueNextStep()
        this.nextStep(nextStep)
    }
}

//OnlineStpre poner value objects
