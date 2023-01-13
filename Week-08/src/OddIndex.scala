

object OddIndex {
  def main(args: Array[String]): Unit = {
    var nums = Array(3.4, 5.0, 6.2, 7.5, 8.9, 2.3, 1.2, 4.5, 9.0, 3.3)
    
    var i = nums.length - 1
    while (i > 0) {
      println("Index is: " + i + "; Value is: " + nums(i) + " ")
      i = i - 2
    }
  }
}