import scala.io.StdIn.readInt

object Rectangle {
  def main(args: Array[String]): Unit = {
    print("Enter the height of the rectangle? ")
    val height = readInt()
    
    print("Enter the width of the rectangle? ")
    val width = readInt()
    
    println()
    
    for (row <- 1 to height) {
      for (col <- 1 to width) {
        print("* ")
      }
      print("\n")
    }
  }
}