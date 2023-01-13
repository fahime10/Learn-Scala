import scala.io.StdIn.readInt

object TimesTableGrid {
  def main(args: Array[String]): Unit = {
    print("Type in a times table size: ")
    var tableSize = readInt()
    
    for (row <- 1 to tableSize) {
      for (col <- 1 to tableSize) {
        print(f"${row * col}%4d" + " ")
      }
      println()
    }
    
    println("\n")
  }
}

/** Another approach is this:

   for (row <- 1 to tableSize; col <- 1 to tableSize) {
     print(f"${row * col}%4d" + " ")
     if (col == tableSize) println() */