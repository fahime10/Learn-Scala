import scala.io.StdIn.readInt

object Triangle3 {
  def main(args: Array[String]): Unit = {
    print("Enter a value to determine base and height of the triangle: ")
    val baseHeight = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= baseHeight) {
      
      var col: Int = 1
      
      while (col <= baseHeight) {
        if (col <= baseHeight - row) 
          print("  ")                //spaces matter, one space makes it centered, two makes it look like reflection
         else 
          print("* ")
        
        
        col += 1
      }
      
      print("\n")
      row += 1
    }
  }
} /** the way it works is, if value is 5, then
first row is, 1 <= 5 for outer loop, for inner is 1 <= 5 -1,
* which equals to 1 <= 4, so statement is true and give 4 double spaces and so on.
*/
