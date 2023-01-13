import scala.io.StdIn._

object SumToN {
  def main(args: Array[String]): Unit = {
    print("Input the value of N ")
    var n: Int = readInt()
    
    var sum: Int = n * (n + (1)) / 2
    println("The sum from 1 to " + n + " is " + sum)
  }
}