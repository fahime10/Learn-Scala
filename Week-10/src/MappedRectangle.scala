import scala.io.StdIn.readInt

object MappedRectangle {
  def main(args: Array[String]): Unit = {
    print("Enter the width of the rectangle: ")
    val width = readInt()
    
    print("Enter the height of the rectangle: ")
    val height = readInt()
    
    println()
    
    (1 to height).map(x => "* " * width).foreach(println)
  }
} 

// if the user inputs 7 for the height and 10 for the width,
// this is how it would be visualised:
// 1 111111111
// 2 222222222
// and so on