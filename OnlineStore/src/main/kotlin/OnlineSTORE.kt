class OnlineStore(private var stock: Store, private var output: Screen, private var cart: ShoppingCart){
    private fun nextStep(step: String){
        when(step){
            "1" -> {
                cart.addAProductToTheCart(stock.productToShow)
                output.showProductSumary(cart.seeProductSummary())
                cart.calculateTotal()
                nextStep(output.askForCatalogueNextStep())
            }
            "2" -> showProducts()
            "3" -> {
                output.showProductInformation(stock.showProduct(output.askForAProduct()))
                nextStep(output.askForProductNextStep())
            }
            "4" -> {
                output.showShoppingCart(cart)
                nextStep(output.askForCheckout())
            }
        }
    }
    fun showProducts(){
        output.showProducts(stock.showStoreLowerThan(output.askForProductsLowerThan()))
        this.nextStep(output.askForCatalogueNextStep())
    }
}