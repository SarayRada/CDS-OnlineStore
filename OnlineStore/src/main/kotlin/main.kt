fun main() {
    val store: Store =Store()
    val screen: Screen = Screen(store)
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(store, screen, shoppingCart)
    onlineStore.showProducts()
}