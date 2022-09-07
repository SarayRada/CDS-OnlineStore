class OnlineStore {
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    fun showStock(){
        output.showInformation()
    }

}

class Screen(store:Store){
    private var storeToShow: Store = store
    fun showInformation(){
        for (products in storeToShow.showMyProducts()){
            println(products.showProductImage())
            println(products.showProductDescription())
            println(products.showProductAttribute())
            println("\uD83D\uDCB0 Price: ${products.showProductPrice()}€")
            println("Reference: ${products.showProductReference()}\n")
        }
    }
}
class Store (){
    private var productsStock:  MutableList<Product> = mutableListOf(Product("\uD83D\uDCFA","Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.", 300.99, "W2C"), Product("\uD83C\uDFB9", "Untuned musical keyboard, 4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you. ", 1003.00, "X4A"))
    fun showMyProducts():MutableList<Product>{
        return productsStock
    }


}
class Product(image:String, description: String, attribute: String, price: Double, reference:String){
    private var productImage:String
    private var productDescription:String
    private var productHighlightAttribute:String
    private var productPrice: Double
    private var productReference:String
    init {
        productImage = image
        productDescription = description
        productHighlightAttribute = attribute
        productPrice = price
        productReference = reference
    }
    fun showProductImage():String{
        return productImage
    }
    fun showProductDescription(): String{
        return  productDescription
    }
    fun showProductAttribute(): String{
        return  productHighlightAttribute
    }
    fun showProductPrice(): Double{
        return  productPrice
    }
    fun showProductReference(): String{
        return  productReference
    }
}

fun main(){
    var onlineStore: OnlineStore = OnlineStore()
    onlineStore.showStock()
}