class OnlineSTORE {
}

class Products{
    private var productsList: MutableList<Product> = mutableListOf()
}

class Product(name:String,image:String,reference:Int,id: Int, price: Double,description: String ){
    fun actualiceData(){
    }
    fun showData(){}
}

class Carrito{
    private var productsInTheShoppingBasket: MutableList<Product> = mutableListOf()
    fun addProductsToTheBasket(){
    }
    fun deleteProducts(){}
    fun showBaskets{
        // for each
    }
}
/*
Crear una clase {
    Var lista de productos{}
    Fun add product{}
    fun deleteProduct (){
    }
}*/

class Costumer {
    private var myShoppintList: Carrito = Carrito()
    fun pay(){}
    fun askForTheCheck(){}
    fun seeMyBasket(){}
}

class Receipt {

}

Lógica de dominio
Capa de presenta
