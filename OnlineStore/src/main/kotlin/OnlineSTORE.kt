class OnlineStore(private var storeQueries: StoreQueries, private var counter: Counter, private var questionCounter: QuestionCounter, private var shoppingCart: ShoppingCart){
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
        val cart = shoppingCart.cart
        counter.showShoppingCart(cart)
        nextStep(questionCounter.askForCheckout())
    }
    private fun showProductInformation() {
        val reference = questionCounter.askForAProductToExplore()
        val product: Product? = storeQueries.getAProduct(reference)
        val howManyOfAProduct = storeQueries.getTheAmountOfAProduct(reference)
        counter.showProductInformation(product, howManyOfAProduct)
        nextStep(questionCounter.askForProductNextStep())
    }
    private fun addAProductToCart() {
        val reference = questionCounter.askForAProductReference()
        val productToShow = storeQueries.getAProduct(reference)
        if (productToShow != null) {
            shoppingCart.addAProductToTheCart(productToShow)
        } else {
            counter.showNoProductErrorMessage()
        }
    }
    private fun showProductSummary() {
        val summary = shoppingCart.getLastProductAdded().reference
        counter.showProductSummary(summary)
        nextStep(questionCounter.askForCatalogueNextStep())
    }
    fun showProducts(){
        val price = questionCounter.askForProductsLowerThan()
        val productsBelowAPrice = storeQueries.getProductsBelowAPrice(price)
        counter.showProducts(productsBelowAPrice)
        val nextStep = questionCounter.askForCatalogueNextStep()
        this.nextStep(nextStep)
    }
}