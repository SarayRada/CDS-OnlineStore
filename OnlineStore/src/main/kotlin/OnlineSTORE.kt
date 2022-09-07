class OnlineStore {
    private var listOfProducts: MutableList<Product> = mutableListOf()
    fun showMyList():MutableList<Product>{
        return listOfProducts
    }
    fun addProductToList(product: Product) {
       listOfProducts.add(product)
    }
}

class Product(image:String, description: String, attribute: String, price: Int, reference:String){
    private var productImage:String
    private var productDescription:String
    private var productHighlightAttribute:String
    private var productPrice: Int
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
    fun showProductPrice(): Int{
        return  productPrice
    }
    fun showProductReference(): String{
        return  productReference
    }
}

fun main(){
}