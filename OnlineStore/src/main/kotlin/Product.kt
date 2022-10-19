
class Product(image:String, description: String, attribute: String, longDescription:String, price: Double, reference:String){
    var productImage:String = image
        private set
    var productDescription:String = description
        private set
    var productHighlightAttribute:String = attribute
        private set
    var productPrice: Double = price
        private set
    var productReference:String = reference
        private set
    var productLongDescription:String = longDescription
        private set
}
