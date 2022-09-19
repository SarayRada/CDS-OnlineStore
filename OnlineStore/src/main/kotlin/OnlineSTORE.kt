class OnlineStore{
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    private var reference: String = ""

    fun showStock(){
        output.showSortedStocklowerThan()
        output.nextStep()
    }
}