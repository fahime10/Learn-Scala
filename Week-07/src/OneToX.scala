
import scala.io.StdIn.readInt

object OneToX {
  def main(args: Array [String]): Unit = {
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()
    
    var count: Int = 1 //which is the start value
    
    while (count <= max) {
      println(f"$count%4d")
      count +=1 //this is an increment by one
    }
  }
  
}