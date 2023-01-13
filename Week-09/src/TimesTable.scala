import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Enter an integer value for your times table: ")
    var int1: Int = readInt()
    
    println()
    
    for (x <- 1 to 12) {
      println(f"$x%2d" + "  x" + f"$int1%3d" + " =" + f"${x*int1}%4d")
    }
  }
}