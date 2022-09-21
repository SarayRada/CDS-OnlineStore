class OnlineStore{
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    private var cart: ShoppingCart = ShoppingCart()
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
        }
    }
    fun showProducts(){
        output.showProducts(stock.showStoreLowerThan(output.askForProductsLowerThan()))
        nextStep(output.askForCatalogueNextStep())
    }
}