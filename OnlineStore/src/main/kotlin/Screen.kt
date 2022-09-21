class Screen(store:Store){
    private var storeToShow: Store = store
    fun showProducts(){
        for (product in storeToShow.showStore()){
            println(product.showProductImage())
            println(product.showProductDescription())
            println(product.showProductAttribute())
            println("\uD83D\uDCB0 Price: ${product.showProductPrice()}€.")
            println("Reference: ${product.showProductReference()}\n")
        }

    }
    fun askForAProduct():String{
        println("Which product do you like to explore?\nEnter a produt's reference:")
        return readln()
    }
    fun showProductInformation(product:Product){
        println(product.showProductImage())
        println("\uD83D\uDCB0 Price: ${product.showProductPrice()} €.")
        println("Reference: ${product.showProductReference()}")
        println("${storeToShow.howManyOfThisProduct(product.showProductReference())} left.\n")
        println("SUMMARY:")
        println("${product.showProductDescription()}\n")
        println("DESCRIPTION:\n" +
                "${product.showProductAttribute()}\n" +
                "${product.showLongDescription()}\n")
    }
    fun askForProductNextStep():String{
        println("""What would you like to do next?
            |
            |1. Add product to cart.
            |2. Keep browsing the catalog
        """.trimMargin())
        return readln()
    }
}