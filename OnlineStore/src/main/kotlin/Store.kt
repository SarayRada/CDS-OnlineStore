class Store (){
    private var productsStock:  MutableList<Product> = mutableListOf(Product("\uD83D\uDCFA","Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.", 300.99, "W2C"), Product("\uD83C\uDFB9", "Untuned musical keyboard, 4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you. ", 1003.00, "X4A"))
    fun showMyProducts():MutableList<Product>{
        return productsStock
    }
}