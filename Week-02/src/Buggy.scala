import scala.io.StdIn._

object Buggy {
  def main(args: Array[String]): Unit = {
    println("Input letter followed by space and then a number")
    
    var letter: Char = readChar()
    var number: Int = readInt()
     
     println("The data is " + letter + " and " + number + "!")
  }
}