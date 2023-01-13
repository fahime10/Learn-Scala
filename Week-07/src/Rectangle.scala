import scala.io.StdIn.readInt

object Rectangle {
  def main(args: Array[String]): Unit = {
    print("Enter the width of the rectangle: ")
    val width = readInt()
    
    print("Enter the length of the rectangle: ")
    val length = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= length) {
      
      var col: Int = 1
      
      while (col <= width) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
  }
}