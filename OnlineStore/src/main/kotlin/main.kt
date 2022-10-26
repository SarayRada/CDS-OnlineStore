fun main() {
    val handleStore: Store =Store (DataStore())
    val screen: Screen = Screen(handleStore)
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(handleStore, screen, shoppingCart)
    onlineStore.showProducts()
}