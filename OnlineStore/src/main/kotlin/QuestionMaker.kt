class QuestionMaker {
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