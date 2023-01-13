
import scala.io.StdIn.readInt

object OddEven {
  def main(args: Array[String]): Unit= {
    println("Type in a number ")
    var number: Int = readInt()
    
    var result = if (number % 2 == 0) //note that the curly braces have been omitted, but it still works fine
        "even" //note that in this instance, we are not required to define the type of data (String)
    else       //the compiler understands it is a string because of the speech marks
        "odd"
    
      var sign: String = if (number >= 0) {
        "positive"
      } else {
        "negative"
      }
      
      println("Your number is " + result + " and it's " + sign)
  }
}