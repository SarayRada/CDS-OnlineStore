import java.io.Console
import java.util.logging.ConsoleHandler

class OnlineStore{
    private var stock: Store = Store()
    private var output: Screen = Screen(stock)
    fun nextStep(step: String){
        when(step){
            "2" -> showProducts()
        }
    }
    fun showProducts(){
        output.showProducts()
        output.showProductInformation(stock.showProduct(output.askForAProduct()))
        nextStep(output.askForProductNextStep())
    }
}