class Store (){
    private var productsStock:  MutableList<Product> = mutableListOf(
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
    var productToShow:Product =Product("", "", "", "", 0.0, "")
    fun showProduct(reference: String): Product{
        for (product in productsStock){
            if (reference == product.showProductReference()) {
                productToShow = product
                return product
            }
        }
        throw IllegalArgumentException ("That product doesn't exist")
    }
    fun howManyOfThisProduct(reference: String):Int{
        var cantidad = 0
        for (product in productsStock){
            if (product.showProductReference() == reference) cantidad ++
        }
        return cantidad
    }
    fun showStoreLowerThan(price:Double):List<Product>{
        return productsStock.filter { it.showProductPrice() <= price }.distinctBy { it.showProductReference() }
    } // filtrar los que tienen la misma referencia
   }