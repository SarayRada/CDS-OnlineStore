class OnlineStore{
    private var productsCatalogue: Catalogue = Catalogue()
    fun addProductToList(product: Product){
        Products().addToMyList(product)
    }
class Products(){
    private var listOfProducts: MutableList<Product> = mutableListOf()
    fun addToMyList(product: Product){
        listOfProducts.add(product)
    }
    fun showMyList():MutableList<Product>{
        return listOfProducts
    }
}
class Catalogue(){
    private var myProductInformation: MutableList<String> = mutableListOf()
    fun takeProductsInformation() {
        for (products in Products().showMyList()) {
                myProductInformation.add(products.showInformation().joinToString {"/n"})
            }
        }
    fun showCatalogue():MutableList<String>{
        return myProductInformation
    }
}

class Screen{
    private var myCatalogue: MutableList<String> = mutableListOf()
    init {
        fun seeProducts(){
            for (information in Catalogue().showCatalogue()){
                myCatalogue.add("$information\n\n")
            }
        }
    }

    fun seeCatalogue(): MutableList<String>{
        return myCatalogue
    }
}



class Client{
    fun seeCatalogue():MutableList<String>{
        return Screen().seeCatalogue()
    }
    fun chooseProducts(){}
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
    var piano: Product = Product("\uD83C\uDFB9", "Untuned musical keyboard, 4 octaves\n" +
            "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you."
            "1003.00 €","X4A")
    var myOnlineStore:OnlineStore = OnlineStore()
    myOnlineStore.addProductToList(televisionTDSystem)
    myOnlineStore.addProductToList(piano)
    Catalogue().showCatalogue()
println(Client().seeCatalogue())
}