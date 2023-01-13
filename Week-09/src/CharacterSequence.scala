import scala.io.StdIn.readChar

object CharacterSequence {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()
    
    println("End character? ")
    var end: Char = readChar()
    
    println()
    
    if (start < end) {
      for (x <- start to end) {
        print(x + " ")
      }
    } else {
      for (x <- start.toInt to end.toInt by -1) {
        print(x.toChar + " ")
      }
    }
  }
}