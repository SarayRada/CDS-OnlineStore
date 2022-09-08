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
}