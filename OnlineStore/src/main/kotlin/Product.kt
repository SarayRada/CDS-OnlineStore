
class Product(val image:String,
              val description: String,
              val highlightAttribute: String,
              val longDescription:String,
              val price: Price,
              val reference:String){
}


@JvmInline
value class Price (private val price: Double){
    operator fun compareTo (price: Double): Int {
        return this.price.compareTo(price)
    }
}

//Tell don't ask make it well
