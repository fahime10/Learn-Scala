import scala.io.StdIn.readInt

object TimesTable2 {
  def main(args: Array[String]): Unit = {
    println("Type in a times table size: ")
    var num = readInt()
    
    var row: Int = 1
    
    println()
    
    while (row <= num) {
      
      var col: Int = 1
      
      while (col <= num) {
        print(f"${row * col}%4d" + " ")
        col += 1
      } 
      print("\n")
      row += 1
  }
    }
}