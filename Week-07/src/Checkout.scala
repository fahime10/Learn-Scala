
import scala.io.StdIn.readDouble

object Checkout {
  def main(args: Array[String]): Unit = {
    var price: List[Double] = List()
    
    print("Enter price: ")
    var price1 = readDouble()
    
    while (price1 != 0) {
      price = price :+ price1
      
      print("Price?\t" + price1)
      print("\t" + "Enter price: " )
      price1 = readDouble()
    }
    println("\t-----")
    print("Total:\t" + price.sum)
    print("\t(" + price.size + " items" + ")")
  }
}