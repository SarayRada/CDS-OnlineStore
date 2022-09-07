class OnlineStore {
    private var store: Store = Store()
    fun showProducts(){
        for (product in store.showMyProducts()){
            println("${Screen(product).productInformation.joinToString {"\n"}}\n")
        }
    }

}
class Screen (product: Product){
    var eachProduct: Product = product
    var productInformation: MutableList<String> = mutableListOf()
    fun saveInformationCorrectly(){
        productInformation.add(eachProduct.showProductImage())
        productInformation.add(eachProduct.showProductDescription())
        productInformation.add(eachProduct.showProductAttribute())
        productInformation.add("\uD83D\uDCB0 Price: ${eachProduct.showProductPrice()}€")
        productInformation.add("Reference: ${eachProduct.showProductReference()}")

    }
}

class Store (){
    private var allMyProducts: MutableList<Product> = mutableListOf(Product("\uD83D\uDCFA","Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.", 300.99, "W2C"), Product("\uD83C\uDFB9", "Untuned musical keyboard, 4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you. ", 1003.00, "X4A"))
    fun showMyProducts():MutableList<Product>{
        return allMyProducts
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
    println(onlineStore.showProducts())
}