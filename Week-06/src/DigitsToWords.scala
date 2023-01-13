
import scala.io.StdIn.readInt

object DigitsToWords {
  def main(args: Array[String]): Unit = { 
    println("Enter a digit: ")
    var digit: Int = readInt()
    
     var integer = if (digit == 0) {
         "ZERO"
     } else if (digit == 1) {
         "ONE"
     } else if (digit == 2) {
         "TWO"
     } else if (digit == 3) {
         "THREE"
     } else if (digit == 4) {
         "FOUR"
     } else if (digit == 5) {
         "FIVE"
     } else if (digit == 6) {
         "SIX"
     } else if (digit == 7) { 
          "SEVEN"
     } else if (digit == 8) {
          "EIGHT"
     } else if (digit == 9) {
          "NINE"
     } else {
       "NOT A DIGIT"
      }
    
    
    println(integer)
  }
}