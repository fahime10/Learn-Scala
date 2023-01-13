import scala.io.StdIn._

object IPlusJTimesK {
  def main(args: Array[String]): Unit = {
    println("Enter value for i ")
    var i: Int = readInt()
    
    println("Enter value for j ")
    var j: Int = readInt()
    
    println("Enter value for k ")
    var k: Int = readInt()
   
    println("The answer is " + ((i + j) * k))
  }
}