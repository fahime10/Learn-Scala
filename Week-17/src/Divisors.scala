import scala.io.StdIn.readInt

object Divisors {
  
  def countDivisors(n: Int): Int = {
    var d: Int = 0
    for (k <- 1 until n)
      if (n % k == 0)
        d = d + 1
    d    
  }
  
  def countDivisors1(n: Int): Int = (1 until n) filter (k => n % k == 0) length
  
  def main(args: Array[String]): Unit = {
    println("Enter a number to find out the no. of its divisors: ")
    var x = readInt()
    println()
    println("For " + x + ", the number of divisors are: " + countDivisors(x))
  }
}