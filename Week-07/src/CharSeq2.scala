import scala.io.StdIn.readChar

object CharSeq2 {
  def main(args: Array[String]): Unit = {
    println("Enter start character: ")
    var start: Char = readChar()
    
    println("Enter end character: ")
    var end: Char = readChar()
    
    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
   
    if (start > end) {
    while (start >= end) {
      print(end + " ")
      end = (end + 1).toChar
    }
  }
}
}