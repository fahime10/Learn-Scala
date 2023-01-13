import scala.io.StdIn.readInt

object Square {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height and width of the square ")
    val heightWidth = readInt()
    
    println()
    
    var row = 1
    
    while (row <= heightWidth) { //the outer loop determines the number of rows
      
      var col = 1
      
      while (col <= heightWidth) { //the inner loop determines the number of columns
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
    //  1234   row 1
    //  1234   row 2
    //  1234   row 3
    //  1234   row 4
    
      }
    }