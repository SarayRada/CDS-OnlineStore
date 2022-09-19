class OnlineStore{
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    private var reference: String = ""

    fun showProducts(){
        output.showSortedStocklowerThan()
        output.nextStep()
    }
    fun showStock(){
        output.showInformation()
    }
    fun showProductInformation(){
       output.showProductInformation(output.askforProduct())
       output.askForNextStep()
    }
}