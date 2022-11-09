class Counter {
    fun showProducts(list: List<Product>){
        for (product in list){
            println(product.image)
            println(product.description)
            println(product.highlightAttribute)
            println("\uD83D\uDCB0 Price: ${product.price}€.")
            println("Reference: ${product.reference}\n")
        }
    }
    fun showProductInformation(product:Product?, howManyOfThisProduct:Int){
        if (product != null) {
            println(product.image)
            println("\uD83D\uDCB0 Price: ${product.price} €.")
            println("Reference: ${product.reference}")
            println("$howManyOfThisProduct left.\n")
            println("SUMMARY:")
            println("${product.description}\n")
            println(
                "DESCRIPTION:\n" +
                        "${product.highlightAttribute}\n" +
                        "${product.longDescription}\n"
            )
        }
    }
    fun showProductSummary(description:String){
        println("\n$description was added to cart.\n")
    }
    fun showShoppingCart(cart:MutableList<Product>){
        val shoppingCart = cart.distinctBy { it.reference }
        val totalOfTheShopping = shoppingCart.sumOf { it.price }
        for (product in shoppingCart) {
            println("**** SHOPPING CART ****\n")
            println(product.image)
            println(product.description)
            println("--")
            println("\uD83D\uDCB0 Price: ${product.price} €.")
            println("Reference: ${product.reference}")
            println("Units: ${cart.count { it.reference == product.reference }}")
            val subtotalCalculation = (product.price) * cart.count { it.reference == product.reference }
            println("Subtotal: $subtotalCalculation")
            println("--\n")
        }
        println("""TOTAL:
            |$totalOfTheShopping
            |
            |*************************
        """.trimMargin())
    }
    fun showNoProductErrorMessage (){
        println("That product doesn't exist")
    }
}