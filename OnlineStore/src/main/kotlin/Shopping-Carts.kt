class ShoppingCart(){
    val productsInCart = ProductsInCart() // code smell lookea -> lista de productos no tienen significados
    // que me de el total de la compra
    fun addAProductToTheCart(product: Product) {
        productsInCart.add(product)
    }
    fun getLastProductAdded():Product{
        return productsInCart.last()
    }
}
data class ProductsInCart(val value:MutableList<Product>){
    fun calculateTotalPrice():Double{} //¿por qué lo hacemos aquí? Para que siga la regla de la encapsulación -->
    // pensar en la cajera hija de ...
}

// TELL DON'T ASK
// Pensar en: Procesos, responsabilidades --> ordenarlo en componentes (con sus limites) y sus colaboradores
//Data class está pensada para que pueda ser usada como value objects
// Tener en mente el saber que estás haciendo
//En Kotlin te aseguras que puedes acceder al valor que envuelves si tener el getter
/*
Crear cadena de COLABORADORES! -> poner limite de las responsabilidades.
- Software modular, extensible y testeable
 */