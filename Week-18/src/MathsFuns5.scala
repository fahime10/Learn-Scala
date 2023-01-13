

object MathsFuns5 {
  def add(x: Int, y: Int): Option[Int] = {
    if ((x < 0 && y > 0) || (x > 0 && y < 0) || x == 0 || y == 0)
     // if x and y have different signs or x or y equal zero then cannot overflow
      Some(x + y)  // therefore safe to add
      else if (x > 0) {
        // both x and y must be greater than zero and overflow could occur
        if (Int.MaxValue - x >= y)
          Some(x + y)   // it is safe to add
          else 
            None        // overflow would occur
      } else {
        // both x and y must be less than zero and underflow could occur
        if (Int.MinValue - x <= y)
          Some(x + y)   // it is safe to add
          else
            None        // underflow would occur
      }
  }
  
  def analyseAdd(x: Int, y: Int): Unit = {
    add(x,y) match {
      case Some(n) => println(s"Adding $x to $y produces $n")
      case None => println(s"Adding $x to $y causes under/overflow")
    }
  }
  
  def div(x: Int,y: Int): Option[Int] =  {
    if (y != 0)
      Some(x / y)
      else 
        None   
  }
  
  def analyseDiv(x: Int,y: Int): Unit = {
    div(x,y) match {
      case Some(n) => println(s"Dividing $x to $y produces $n")
      case None => println(s"Dividing $x to zero gives a math error")
    }
  }
  
  def main(args: Array[String]): Unit = {
    println(add(3,4))    // it is not possible to write (add(3,4)) * 2
                         // the result is not an integer
    
    println()
    
    val big: Int = 2147483647
    val small: Int = -2147483648
    val mid0: Int = 46340
    val mid1: Int = 46341
    
    analyseAdd(small,small)
    analyseAdd(small,-1)
    analyseAdd(small,big)
    analyseAdd(big,big)
    analyseAdd(big,1)
    analyseAdd(big,small)
    
    println()
    
    println(div(100,4))
    
    analyseDiv(24,2)
    analyseDiv(75,0)
  }
}