import scala.io.StdIn._

object Speed {
  def main(args: Array[String]): Unit = {
    print("Enter the initial speed ")
    var initial: Double = readDouble()
    
    print("Enter the acceleration ")
    var acc: Double = readDouble()
    
    print("Enter the time taken ")
    var time: Double = readDouble()
    
    var finSpeed: Double = initial + (acc * time)
    
    println("\nThe final speed is " + finSpeed)
  }
}