import scala.io.StdIn._

object Operators {
  def main(args: Array[String]): Unit = {
    println("Enter a number ")
    var y: Int = readInt()
    println("1 x " + y + " = " + (1 * y))
    println("10 x " + y + " = " + (10 * y))
    println("100 x " + y + " = " + (100 * y))
    
    println("\nEnter a second number ")
    var z: Int = readInt()
    println("The sum of your two numbers is " + (y + z))
    println("The product is " + (y * z))
    println("The sum of the squares of the two numbers is " + ((y * y) + (z * z)))
  }
}