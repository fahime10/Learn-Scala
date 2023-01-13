

object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    var nums = new Array[Int](50)
    
    var i = 0
    while (i < nums.length) { // this first loop assigns values into the array to each cell
      nums(i) = i             
      i += 1
    }
    
    i = nums.length - 1
    while (i >= 0) {       // this second loop prints out the array content in reverse order
      println(nums(i))
      i -= 1
    }
  }
}