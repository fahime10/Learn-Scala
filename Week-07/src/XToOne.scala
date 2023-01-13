
import scala.io.StdIn.readInt

object XToOne {
  def main(args: Array[String]): Unit = {
    println("Enter a maximum between 2-1000: ")
    var max = readInt()
    
    var count = max
    
    while (count > 0) {
      println(f"$count%4d")
      count -= 1
    }
  }
}