

object UsingArrays2 {
  def main(args: Array[String]): Unit = {
    var num = new Array[Int](5)
    num(0) = 4
    num(1) = 34
    num(2) = 2
    num(3) = 1
    num(4) = 10
    
    println("The letters in your array are: ")
    println(num(1))
    println(num(4))
    println(num(0))
    println(num(2))
    println(num(3))
  }
}