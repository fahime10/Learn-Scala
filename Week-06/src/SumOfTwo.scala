
import scala.io.StdIn.readInt

object SumOfTwo {
  def main(args: Array[String]): Unit = {
    println("Enter your first integer: ")
    var int1: Int = readInt()
    
    println("Enter your second integer: ")
    var int2: Int = readInt()
    
    println("Enter your third integer: ")
    var int3: Int = readInt()
    
     var result = if (int1 + int2 == int3) {
        "YES"
      } else {
        "NO"
      }
    
    println(result)
    
  }
}