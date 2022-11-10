class OnlineStore(
    private val storeQueries: StoreQueries,
    private val informationCounter: InformationCounter,
    private val questionCounter: QuestionCounter,
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
        val cart = shoppingCart.productsInCart
        informationCounter.showShoppingCart(cart)
        nextStep(questionCounter.askForCheckout())
    }
    private fun showProductInformation() {
        val reference = questionCounter.askForAProductToExplore()
        val product: Product? = storeQueries.getAProduct(reference)
        val howManyOfAProduct = storeQueries.getTheAmountOfAProduct(reference)
        informationCounter.showProductInformation(product, howManyOfAProduct)
        nextStep(questionCounter.askForProductNextStep())
    }
    private fun addAProductToCart() {
        val reference = questionCounter.askForAProductReference()
        val productToShow = storeQueries.getAProduct(reference)
        if (productToShow != null) {
            shoppingCart.addAProductToTheCart(productToShow)
        } else {
            informationCounter.showNoProductErrorMessage()
        }
    }
    private fun showProductSummary() {
        val summary = shoppingCart.getLastProductAdded().reference
        informationCounter.showProductSummary(summary)
        nextStep(questionCounter.askForCatalogueNextStep())
    }
    fun showProducts(){
        val price = questionCounter.askForProductsLowerThan()
        val productsBelowAPrice = storeQueries.getProductsBelowAPrice(price)
        informationCounter.showProducts(productsBelowAPrice)
        val nextStep = questionCounter.askForCatalogueNextStep()
        this.nextStep(nextStep)
    }
}

//OnlineStpre poner value objects
