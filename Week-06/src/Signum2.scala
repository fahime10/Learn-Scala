
import scala.io.StdIn.readInt

object Signum2 {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()
    
      var message = if (number > 0) {
        "positive"
      } else if (number < 0) {
        "negative"
      } else {
        "zero"
      }
       
    println("Your number is " + message) 
  }
}