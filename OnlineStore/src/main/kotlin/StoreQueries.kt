class StoreQueries (){
    private val stock:  MutableList<Product> = mutableListOf(
        Product(Image("\uD83D\uDCFA"),
            Description("Glamorous panoramic television, 13 inches"),
            Attribute("With this panoramic television, your friday nights will be boring no more."),
            Price(300.99),
            Reference("W2C")),

        Product(Image("\uD83C\uDFB9"),
            Description("Untuned musical keyboard, 4 octaves"),
            Attribute("Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you."),
            Price(1003.00),
            Reference("X4A")))
    fun getAProduct(reference: String): Product? {

        return try {
           stock.first { it.reference.value == reference }

        } catch (ex: NoSuchElementException) {
            null
        }
    }
    fun getTheAmountOfAProduct(reference: String): Int {

        return stock.count {it.reference.value == reference}
    }
    fun getProductsBelowAPrice(price:Double):List<Product>{
        return stock.filter { it.price.value <= price }
            .distinctBy { it.reference.value }
        }
   }