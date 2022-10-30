fun main() {
    val storeQueries: StoreQueries =StoreQueries (ProductStore())
    val screen: Screen = Screen()
    val shoppingCart: ShoppingCart = ShoppingCart()
    val onlineStore: OnlineStore = OnlineStore(storeQueries, screen, shoppingCart)
    onlineStore.showProducts()
}