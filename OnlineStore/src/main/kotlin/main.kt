fun main() {
    val storeQueries: StoreQueries =StoreQueries()
    val informationCounter: InformationCounter = InformationCounter()
    val questionCounter: QuestionCounter =QuestionCounter()
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(storeQueries, informationCounter, questionCounter, shoppingCart)
    onlineStore.showProducts()
}