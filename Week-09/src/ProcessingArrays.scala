import scala.io.StdIn.readInt

object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    println("Enter the range of the array:")
    var range: Int = readInt()
    
    var nums = new Array[Int](range)
    
    for (i <- 0 until nums.length) {
      nums(i) = i + 1
    }
    
    for (x <- nums) {
      print(x + " ")
    }
  }
}