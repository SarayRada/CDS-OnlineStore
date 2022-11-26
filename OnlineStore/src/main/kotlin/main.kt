fun main() {
    val storeQueries: StoreQueries =StoreQueries()
    val informationScreen: InformationScreen = InformationScreen()
    val questionMaker: QuestionMaker =QuestionMaker()
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(storeQueries, informationScreen, questionMaker, shoppingCart)
    onlineStore.showProducts()
}