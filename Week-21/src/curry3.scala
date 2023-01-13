import scala.io.StdIn.readInt

object curry3 {
  def length(x: Int)(y: String) = x==y.length
  def byLength(length:Int)(word:String): Boolean = 
   word.length()==length
   
  def main(args: Array[String]): Unit = {
    var list = List("apple", "pear", "banana", "peach")
    var list2 = List("fish","shark", "dog", "wolf", "cat", "lion")
    
    println("Enter an integer: ")
    var x = readInt()
    
    println((list) filter (length(x)))
    println((list2) filter (length(x)))
    println((list) filter (byLength(x)))
    println((list2) filter (byLength(x)))
  }
}
// y on the left and x on the right