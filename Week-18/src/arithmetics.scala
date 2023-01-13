

object arithmetics {
  def mul(x: Long, y: Long): Option[Int] = {
    if (x > 0 && y > 0 || x < 0 && y < 0) {
      if (x > Int.MaxValue && y > Int.MaxValue || x < Int.MinValue && y < Int.MinValue)
        return None 
      else 
        Some(x.toInt * y.toInt)
        
    } else {
      if (x < Int.MinValue && y > Int.MaxValue || x > Int.MaxValue && y < Int.MinValue)
      return None
       else 
        Some(x.toInt * y.toInt)
  }
  }
  
  def sub(x: Int, y: Int): Option[Int] = {
    if ((x < 0 && y > 0) || (x > 0 && y < 0) || x == 0 || y == 0) {
      Some(x - y)
    } else if (x > 0) {
        if (Int.MaxValue - x >= y)
          Some(x - y)
          else 
            None
      } else {
        if (Int.MinValue - x <= y) 
          Some(x - y)
          else 
            None
      } 
  }
    
    def main(args: Array[String]): Unit = {
      
      var a: Long = 2147483649L
      var b: Long = 2147483649L
      
      println(mul(3,4))
      println(mul(-3,4))
      println(mul(-2147483648,-2147483648))
      println(mul(a,b))
      println(sub(54,18))
      println(sub(-2147483648,-15))
    }
}