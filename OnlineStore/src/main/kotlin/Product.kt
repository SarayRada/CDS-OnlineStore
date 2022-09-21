
class Product(image:String, description: String, attribute: String, longDescription:String, price: Double, reference:String){
    private var productImage:String = image
    private var productDescription:String = description
    private var productHighlightAttribute:String = attribute
    private var productPrice: Double = price
    private var productReference:String = reference
    private var productLongDescription:String = longDescription

    fun showProductImage(): String =  productImage
    fun showProductDescription(): String = productDescription
    fun showProductAttribute(): String = productHighlightAttribute
    fun showProductPrice(): Double = productPrice
    fun showProductReference(): String = productReference
    fun showLongDescription():String = productLongDescription
}
