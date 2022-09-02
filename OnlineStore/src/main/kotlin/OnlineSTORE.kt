class OnlineStore{
    private var productsCatalogue: Catalogue = Catalogue()
    private var allProduct: Products =Products()
}

class Screen{
    fun showProducts(){}
}

class Catalogue(){
    var productInformation 

}

class Products(){
    var listOfProducts: MutableList<Product> = mutableListOf()
    fun showProductsInformation (){
        return
    }
}
class Client{
    fun seeScreen(){}
    fun chooseProducts(){}
}

class Product(){
    private var productImage:Char = ' '
    private var productDescription:String = ""
    // <SHORT_DESCRIPTION>, <HIGHLIGHTED_ATTRIBUTE>.
    private var productPrice: Double= 0.0
    // Price: <Price> €
    private var productReference:String = ""
    // Reference: <REFERENCE>
    // linea en blanco al final de cada producto
}