
import scala.io.StdIn.readInt

object InputNumbersUntil {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()
    
    print("First number? ")
    var num = readInt()
    
    while (num >= 0) {
      xs = xs :+ num
      
      print("Another number? ") // answering no will mess up the program. You need to input a negative.
      num = readInt()
    }
    
    println(xs.reverse)
  }
}