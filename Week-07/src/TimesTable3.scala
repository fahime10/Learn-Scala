import scala.io.StdIn.readInt

object TimesTable3 {
  def main(args: Array[String]): Unit = {
    println("Type in a times table size: ")
    var num = readInt()
    
    var header: Int = 1
    
    println()
    
    print("      ")    // this is to align the numbers with the results
    
    while (header <= num) {   // this represents the numbers at the top
      print(f"${header}%4d" + " ")  // this line allows to extract just the numbers in order
      header += 1
    }
    
    header = 1
    print("\n     ")  //this is the gap from the left border
    
    print("-----" * num)
    
    print("\n")
    
    var row: Int = 1
    
    while (row <= num) {
      
      var col: Int = 1
      
      print(f"${row}%3d" + " | ")
      
      while (col <= num) {
        print(f"${row * col}%4d" + " ")
        col += 1
      } 
      print("\n")
      row += 1
  
  }
}
}