class Product(val image:Image,
              val description: Description,
              val highlightAttribute: Attribute,
              val price: Price,
              val reference:Reference){
}

data class Reference (val value:String)
data class Attribute (val value: String)
data class Image (val value:String)
data class Description(val value:String)
data class Price (val value: Double)

//Tell don't ask make it well
