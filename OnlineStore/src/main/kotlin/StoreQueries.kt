class StoreQueries (){
    private val stock:  MutableList<Product> = mutableListOf(
        Product("\uD83D\uDCFA",
            "Glamorous panoramic television, 13 inches",
            "With this panoramic television, your friday nights will be boring no more.",
            "The screen is composed of 14 million pixels.\nThanks to its low energy consumption design, your bills will stay low.",
            300.99,
            "W2C"),

        Product("\uD83C\uDFB9",
            "Untuned musical keyboard, 4 octaves",
            "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you.",
            "",
            1003.00,
            "X4A"),

        Product("\uD83D\uDCFA",
            "Glamorous panoramic television, 13 inches",
            "With this panoramic television, your friday nights will be boring no more.",
            "The screen is composed of 14 million pixels.\nThanks to its low energy consumption design, your bills will stay low.",
            300.99,
            "W2C"))
    fun getAProduct(reference: String): Product? {

        return try {
           stock.first { it.reference == reference }

        } catch (ex: NoSuchElementException) {
            null
        }
    }
    fun getTheAmountOfAProduct(reference: String): Int {

        return stock.count {it.reference == reference}
    }
    fun getProductsBelowAPrice(price:Double):List<Product>{
        return stock.filter { it.price <= price }
            .distinctBy { it.reference }
        }
   }