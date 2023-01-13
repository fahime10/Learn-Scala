import scala.io.StdIn.readInt

object sumFromTo {
  /*def sumFromTo(a: Int, b: Int): Int =
    if (a > b)
      0
    else 
      a + sumFromTo(a+1,b)
      
   def main(args: Array[String]): Unit = {
      println(sumFromTo(7,9))
      println(sumFromTo(5,6))
      println(sumFromTo(7,7))
      println(sumFromTo(2,5))
    } */
  def main(args: Array[String]): Unit = {
  println("Input the first integer: ")
  var a = readInt()
  
  println("Input the second integer: ")
  var b = readInt()
  
  var x: Int = 0
  var y: Int = a
 
  if(a == b) 
    x+=a
  else while (y != (b+1)) {
    x += a
    a = a + 1
    y = y + 1
  }
  
  println(x)
  }
}