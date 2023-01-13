import scala.io.StdIn.readInt

object TimesTableGridArray {
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt()
    
    println("Columns? ")
    var cols = readInt()
    
    //var table = Array.ofDim[Int](rows, cols)
    
    /**for (i <- 0 until rows; j <- 0 until cols) {
      table(i)(j) = (i+1) * (j+1)
    }*/
    
    //POPULATE APPROACH 2
    var table = for (i <- (1 to rows).toArray) yield for (j <- (1 to cols).toArray) yield i*j

    /**for (i <- 0 until rows; j <- 0 until cols) {
      print(f"${table(i)(j)}%4d")
      if (j == cols-1) println()
    }*/
    
    //OUTPUT APPROACH 2
    for (row <- table) {
      for (col <- row) {
        print(f"$col%4d")
      }
      println()
    }
  }
}