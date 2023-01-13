import scala.io.StdIn.readInt

object InputXandY {
  def main(args: Array[String]): Unit = {
    println("Enter your first number ")
    var x: Int = readInt()
    
    println("Enter your second number ")
    var y: Int = readInt()
    
    var sum: Int = x + y
    var product: Int = x * y
    
    println("You entered " + x + " and " + y)
    println("Their sum is " + sum)
    println("Their product is " + product)
  }
}