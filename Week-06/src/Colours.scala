
import scala.io.StdIn.readChar

object Colours {
  def main(args: Array[String]): Unit = {
    println("Type in a digit between 1 and 7: ")
    var digit: Char = readChar()
    
    var result = digit match {
      case '1' => "Red"
      case '2' => "Orange"
      case '3' => "Yellow"
      case '4' => "Green"
      case '5' => "Blue"
      case '6' => "Indigo"
      case '7' => "Violet"
    }
    
    println(result)
  }
}