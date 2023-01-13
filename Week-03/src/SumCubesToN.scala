import scala.io.StdIn._

object SumCubesToN {
  def main(args: Array[String]): Unit = {
    println("Input a value of N: ")
    var n: Int = readInt()
    
    var sumCubes: Int = (n * n) * (n + 1) * (n + 1) / 4
    
    println("The sum of the cubes form 1 to N is: " + sumCubes)
  }
}