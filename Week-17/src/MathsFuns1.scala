

object MathsFuns1 {
  
  def incr(x: Int): Int = x+1
  
  def main(args: Array[String]): Unit = {
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
  }
}
/* the range of values act as x for the function*/