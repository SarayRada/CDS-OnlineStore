class OnlineStore(private var storeQueries: StoreQueries, private var counter: Counter, private var counterQuestions: CounterQuestions, private var shoppingCart: ShoppingCart){
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
        nextStep(counterQuestions.askForCheckout())
    }
    private fun showProductInformation() {
        val reference = counterQuestions.askForAProductToExplore()
        val product: Product? = storeQueries.getAProduct(reference)
        val howManyOfAProduct = storeQueries.getTheAmountOfAProduct(reference)
        counter.showProductInformation(product, howManyOfAProduct)
        nextStep(counterQuestions.askForProductNextStep())
    }
    private fun addAProductToCart() {
        val reference = counterQuestions.askForAProductReference()
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
        nextStep(counterQuestions.askForCatalogueNextStep())
    }
    fun showProducts(){
        val price = counterQuestions.askForProductsLowerThan()
        val productsBelowAPrice = storeQueries.getProductsBelowAPrice(price)
        counter.showProducts(productsBelowAPrice)
        val nextStep = counterQuestions.askForCatalogueNextStep()
        this.nextStep(nextStep)
    }
}