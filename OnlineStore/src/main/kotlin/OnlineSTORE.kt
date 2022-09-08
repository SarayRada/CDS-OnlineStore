class OnlineStore{
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    fun showStock(){
        output.showInformation()
    }
}