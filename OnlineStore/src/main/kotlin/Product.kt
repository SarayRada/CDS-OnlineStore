
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
