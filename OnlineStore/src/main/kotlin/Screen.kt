class Screen {

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
    fun showProductSumary(description:String){
        println("\n$description was added to cart.\n")
    }
    fun showShoppingCart(shoppingCart: ShoppingCart){
        for (product in shoppingCart.seeMyCart()) {
            println("**** SHOPPING CART ****\n")
            println(product.image)
            println(product.description)
            println("--")
            println("\uD83D\uDCB0 Price: ${product.price} €.")
            println("Reference: ${product.reference}")
            println("Units: ${shoppingCart.howManyOfThisProduct(product.reference)}")
            println("Subtotal: ${shoppingCart.calculatePriceOfProduct(product)}")
            println("--\n")
        }
        println("""TOTAL:
            |${shoppingCart.calculateTotal()}
            |
            |*************************
        """.trimMargin())
    }
    fun askForProductsLowerThan():Double{
        println("Browse products with prices lower than:")
        return readln().toDouble()
    }
    fun askForCatalogueNextStep():String{
        println("""What would you like to do next?
            |
            |2. Keep browsing the catalog
            |3. See product's details.
            |4. Go to checkout.
        """.trimMargin())
        return readln()
    }
    fun askForAProductToExplore():String{
        println("Which product do you like to explore?\nEnter a produt's reference:")
        return readln()
    }
    fun askForAProductReference():String{
        println("Enter a product's reference:")
        return readln()
    }
    fun askForProductNextStep():String{
        println("""What would you like to do next?
            |
            |1. Add product to cart.
            |2. Keep browsing the catalog
        """.trimMargin())
        return readln()
    }
    fun askForCheckout():String{
        println("""What would you like to do next?:
            |2. Keep browsing the catalog.
            |5.Confirm Purchase and Pay.
        """.trimMargin())
        return readln()
    }
}