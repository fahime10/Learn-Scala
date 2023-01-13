
import scala.io.StdIn.readChar

object CharSeq3 {
  def main(args: Array[String]): Unit = {
    println("Enter the first character: ")
    var start: Char = readChar()
    
    println("Enter the end character: ")
    var end: Char = readChar()
    
    if (start <= end) {
      while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
      }
    } else if (start > end) {
      while (start >= end) {
        print(start + " ")
        start = (start - 1).toChar
    }
    }
}
}