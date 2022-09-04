class OnlineStore {
    private var listOfProducts: MutableList<Product> = mutableListOf()
    fun showMyList():MutableList<Product>{
        return listOfProducts
    }
    fun addProductToList(product: Product) {
       listOfProducts.add(product)
    }
}
class Catalogue(onlineStore: OnlineStore){
    private var myProductInformation: MutableList<String> = mutableListOf()
    fun takeProductsInformation() {
        for (products in OnlineStore().showMyList()) {
                myProductInformation.add(products.showInformation().joinToString {"/n"})
            }
        }
    fun showCatalogue():MutableList<String>{
        return myProductInformation
    }
}

class Screen (catalogue: Catalogue){
    private var myCatalogue: MutableList<String> = mutableListOf()
    fun seeProducts(){
        for (information in Catalogue(OnlineStore()).showCatalogue()){
            myCatalogue.add("$information\n\n")
        }
    }
    fun seeCatalogue(): MutableList<String>{
        return myCatalogue
    }
}



class Product(image:String= "", description: String="", price: String= "", reference:String= ""){
    private var productImage:String = " "
    private var productDescription:String = ""
    private var productPrice: String= ""
    private var productReference:String = ""
    init {
        productImage = image
        productDescription = description
        productPrice = price
        productReference =reference
    }
    fun showInformation(): List <String>{
        return listOf <String>(productImage, productDescription, "Reference: $productReference","\uD83D\uDCB0Price: $productPrice")
    }
}

fun main(){
    var televisionTDSystem: Product = Product("\uD83D\uDCFA", "Glamorous panoramic television, 13 inches\n" +
            "With this panoramic television, your friday nights will be boring no more.", "300.99 €","W2C")
    var piano: Product = Product("\uD83C\uDFB9", "Untuned musical keyboard, 4 octaves\n", "1003.00 €","X4A")
    var myOnlineStore:OnlineStore = OnlineStore()
    myOnlineStore.addProductToList(televisionTDSystem)
    myOnlineStore.addProductToList(piano)
    var myCatalogue:Catalogue = Catalogue(myOnlineStore)
    myCatalogue.takeProductsInformation()
    var screen:Screen = Screen(myCatalogue)
    screen.seeProducts()
    println(screen.seeCatalogue())
}