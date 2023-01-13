
import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Enter an integer value: ")
    var int: Int = readInt()
    
    var x = 1
    
    println()
    
    while (x < 13) {
      println(x + "\tx\t" + int + "\t=" + f"${x * int}%4d")
      x = x + 1
    }
  }
  
}