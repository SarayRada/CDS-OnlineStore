
class Product(val image:ImageURL,
              val description: String,
              val highlightAttribute: String,
              val longDescription:String,
              val price: Price,
              val reference:String) {
 // hacerlo todo inmutable y así no lo pueden cambiar
    }
@JvmInline
value class ImageURL (val value: String)

@JvmInline
value class Price (val value: Double){ //solo permiten un camppo las value class
    operator fun compareTo (price: Double): Int {
        return this.value.compareTo(price)
    }
}

//Tell don't ask: visibilidad pública lo está poniendo dificilillo wey.
// Encapsulación refuerza el tell don't ask.
// lA DEscripción larga y corta se debe poner junta