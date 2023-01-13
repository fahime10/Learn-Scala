import scala.io.StdIn._

object SumSqToN {
  def main(args: Array[String]): Unit = {
    println("Input a value of n integer: ")
    var n: Int = readInt() 
    
    var sumSq: Int = n * (n + 1) * (2 * n + 1) / 6
    
    println("The sum of the squares of the numbers from 1 up to n is: " + sumSq) 
  }
}