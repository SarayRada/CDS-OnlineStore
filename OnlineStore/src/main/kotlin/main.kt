fun main() {
    val storeQueries: StoreQueries =StoreQueries()
    val counter: Counter = Counter()
    val counterQuestions: CounterQuestions =CounterQuestions()
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(storeQueries, counter, counterQuestions, shoppingCart)
    onlineStore.showProducts()
}