

object MyFuns {
  def odd(x: Int): Boolean = x % 2 != 0
  def even(x: Int): Boolean = x % 2 == 0
  def sqr(x: Int): Int = x * x
  def inv(x: Boolean): Boolean = {
    if (x == true) 
    false 
    else 
      true
  }
  def neg(x: Int): Boolean = x == -x
  def pal(x: List[String]): Boolean = x.equals(x.reverse) // x == x.reverse
  def strlen(x: String): Int = x.length
  def br(x: String): String = "[" + x + "]"
  
  def main(args: Array[String]): Unit = {
    
  println(even(5))
  println(even(6))
  println((1 to 10) map even)
  println((1 to 10) filter even)
  println((1 to 10) filter even map sqr)
  
  println()
  
  println(odd(5))
  println(inv(false))
  println(neg(-4))
  val str: List[String] = List("pop", "foo", "bar", "pip")
  println(pal(str))
  println(strlen("HelloWorld"))
  println(br("Hello"))
      
}
}