
class Product(image:String, description: String, attribute: String, longDescription:String, price: Double, reference:String){
    private var productImage:String = image
    private var productDescription:String = description
    private var productHighlightAttribute:String = attribute
    private var productPrice: Double = price
    private var productReference:String = reference
    private var productLongDescription:String = longDescription
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
    fun showLongDescription():String{
        return productLongDescription
    }
}
