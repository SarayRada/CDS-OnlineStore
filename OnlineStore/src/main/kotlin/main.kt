fun main() {
    val storeQueries: StoreQueries =StoreQueries()
    val counter: Counter = Counter()
    val questionCounter: QuestionCounter =QuestionCounter()
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(storeQueries, counter, questionCounter, shoppingCart)
    onlineStore.showProducts()
}