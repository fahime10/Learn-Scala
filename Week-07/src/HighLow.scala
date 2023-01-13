import scala.io.StdIn._
import scala.util.Random

object HighLow {
  def main(args: Array[String]): Unit = {
    var secret: Int = new Random().nextInt(101)
    
    println("Guess the secret number ")
    var num = readInt()
    
    var count = 1
    
    while (num != secret) {
      if (num != secret) {
        if (num < secret) {
          println("Higher than " + num)
          
          num = readInt()
          
        } else if (num > secret) {
          println("Lower than " + num)
          
          num = readInt()
        }
      }
      count += 1
    }
    
    if (num == secret) {
      println("Correct - this took you " + count + " guesses")
    }
  }
}