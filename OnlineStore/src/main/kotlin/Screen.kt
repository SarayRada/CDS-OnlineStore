import kotlin.system.exitProcess

class Screen(store:Store){
    private var storeToShow: Store = store
    fun showInformation(){
        for (products in storeToShow.showMyProducts()){
            println(products.showProductImage())
            println(products.showProductDescription())
            println(products.showProductAttribute())
            println("\uD83D\uDCB0 Price: ${products.showProductPrice()}€")
            println("Reference: ${products.showProductReference()}\n")
        }
    }

    fun askforProduct():Product{
        println("Enter a produt's reference:")
        val reference = readln()
        return storeToShow.takeOneProduct(reference)
    }
    fun showProductInformation(product: Product){
        println(product.showProductImage())
        println("Reference: ${product.showProductReference()}")
        println("\uD83D\uDCB0Price: ${product.showProductPrice()}€")
        println("${storeToShow.seeHowMuchInStock(product.showProductReference())} left\n")
        println("SUMARY:\n${product.showProductDescription()}\n")
        println("Description:\n${product.showProductAttribute()}\n${product.showLongDescription()}\n")
    }
    fun askForNextStep(){
        println(
            """What would you like to do next?
            |1. Add product to cart..
            |2. Keep browsing..""".trimMargin()
        )
        when (readln()){
            "1" -> false
            "2" -> {
                showSortedStocklowerThan()
                nextStep()
            }
            else -> askForNextStep()
        }
    }

    fun getProductLowerThan():Double{
        println("Browse products with prices lowe than:")
        return  readln().toDouble()
    }
    fun showSortedStocklowerThan(){
        val products = storeToShow.filterByPrice(getProductLowerThan())
        for (product in products){
            println(product.showProductImage())
            println(product.showProductDescription())
            println(product.showProductAttribute())
            println("\uD83D\uDCB0 Price: ${product.showProductPrice()}€")
            println("Reference: ${product.showProductReference()}\n")
        }
    }

    fun nextStep(){
        println("""What would you like to do next?:
            |2. Keep browsing the catalog
            |3. See a product's details.
        """.trimMargin())
        when (readln()){
            "2" -> {
                showSortedStocklowerThan()
                nextStep()
            }
            "3" -> {
                showProductInformation(askforProduct())
                askForNextStep()
            }
        }
    }

}