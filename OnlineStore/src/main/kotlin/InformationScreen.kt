class InformationScreen {
    fun showProducts(list: List<Product>) {
        for (product in list) {
            println(product.image.value)
            println(product.description.value)
            println(product.highlightAttribute.value)
            println("\uD83D\uDCB0 Price: ${product.price.value}€.")
            println("Reference: ${product.reference.value}\n")
        }
    }
    fun showProductInformation(product:Product?, howManyOfThisProduct:Int){
        if (product != null) {
            println(product.image.value)
            println("\uD83D\uDCB0 Price: ${product.price.value} €.")
            println("Reference: ${product.reference.value}")
            println("$howManyOfThisProduct left.\n")
            println("SUMMARY:")
            println("${product.description.value}\n")
            println(
                "DESCRIPTION:\n" +
                        "${product.highlightAttribute.value}\n"
            )
        }
    }
    fun showProductSummary(description:String){
        println("\n$description was added to cart.\n")
    }
    fun showShoppingCart(cart:ShoppingCart){
        val shoppingCart= cart.getProductsDifferentReference()
        for (product in shoppingCart) {
            println("**** SHOPPING CART ****\n")
            println(product.image.value)
            println(product.description.value)
            println("--")
            println("\uD83D\uDCB0 Price: ${product.price.value} €.")
            println("Reference: ${product.reference.value}")
            println("Units: ${cart.getUnitsByReference(product.reference) }}")
            println("Subtotal: ${cart.calculateSubtotal(product.price,product.reference)}")
            println("--\n")
        }
        println("""TOTAL:
            |${cart.totalOfShopping()}
            |
            |*************************
        """.trimMargin())
    }
    fun showNoProductErrorMessage (){
        println("That product doesn't exist")
    }
}
// ENUM: crear un nuevo tipo de dato que le damos uno svalores en especificos
// Responsabilidades con los mismos datos: encapsularlo y hacer funciones con esos datos encapsulados en la misma clase