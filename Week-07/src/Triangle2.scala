import scala.io.StdIn.readInt

object Triangle2 {
  def main(args: Array[String]): Unit = {
    print("Enter a value to determine base and height of your triangle: ")
    var baseHeight = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= baseHeight) {
      
      var col: Int = 1
      
      while (col <= (baseHeight - row + 1)) {  //as rows increase, columns increase as well
        print("* ")                            // first is 1 <= (6 - 1 + 1)
                                               // second is 2 <= (6 - 2 + 1) and so on
        col += 1
    }
    
    print("\n")
    row += 1
    }
  }
  }