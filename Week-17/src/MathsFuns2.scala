

object MathsFuns2 {
  
  def incr(x: Int): Int = x+1
  
  def decr(x: Int): Int = x-1
  
  def sqr(x: Int): Int = x * x
  
  def dbl(x: Int): Int = x * 2
  
  def main(args: Array[String]): Unit = {
    println("Using decr:")
    println(decr(5))
    println((1 to 10) map decr)
    println((1 to 10) map decr map decr)
    
    println()
    
    println("Using sqr:") 
    println(sqr(5))
    println((1 to 10) map sqr)
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map incr)
    
    println()
    
    println("Using double:")
    println(dbl(5))
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map dbl map incr)
    println((1 to 10) map sqr map incr map dbl)
}
}