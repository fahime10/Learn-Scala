
import scala.io.StdIn.readChar

object CharSeq1 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()
    
    println("End character? ")
    var end: Char = readChar()
    
    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
  }
}
/* this program does not work if you were to input
   a start character that should be the end character
   eg. Start = d and end = a */
