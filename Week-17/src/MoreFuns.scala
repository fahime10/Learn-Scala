

object MoreFuns {
  
  val incr: Int => Int = x => x+1
  
  def main(args: Array[String]): Unit = {
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
    
    println()
    
    println((1 to 10) map (x => x + 10 + 3))
    println((1 to 10) map (x => x + 10 + 3) filter (n => n%3==0))
  }
}

/* the last statement shows that you don't need to name values
   or variables and you don't need to use def to write functions */