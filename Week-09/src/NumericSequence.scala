import scala.io.StdIn.readInt

object NumericSequence {
  def main(args: Array[String]): Unit = {
    println("Enter your first integer: ")
    var int1: Int = readInt()
    
    println("Enter your second integer: ")
    var int2: Int = readInt()
    
    println()
    
    if (int1 < int2) {
      for (x <- int1 to int2) {
        print(x + " ")
      }
    } else {
      for (x <- int1 to int2 by -1) {
        print(x + " ")
      }
    }
  }
}