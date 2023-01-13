

object MultipleArgs {
  
  def largerOf(c: Int, d: Int): Int = if (c > d) c else d
  
  //this is lambda syntax
  def smallerOf : (Int,Int) => Int = (e,f) => if (e < f) e else f
  
  def smallerOf3(i: Int, j: Int, k: Int): Int = { 
    if (i <= j && i <= k) 
      i
    else if (j <= i && j <= k) 
      j
    else
      k 
  }
  
  //def smallerOf3(i: Int, j: Int, k: Int): Int = smallerOf((a,b),c)
  
  def medianOf3 : (Int,Int,Int) => Int = (l,m,n) => 
    List(l,m,n).sorted.tail.head
    
  
  def main(args: Array[String]): Unit = {
    
    for (a <- 1 to 3; b <- 1 to 3)
      println(s"Larger of $a and $b is ${largerOf(a,b)}")
      
      println()
      
    for (g <- 1 to 3; h <- 1 to 3)
      println(s"Smaller of $g and $h is ${smallerOf(g,h)}")
        
      println()
       
     for (i <- 1 to 3; j <- 1 to 3; k <- 1 to 3)
       println(s"Smaller of $i and $j and $k is ${smallerOf3(i,j,k)}")
       
     for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
       println(s"Median of $a, $b and $c is ${medianOf3(a,b,c)}")
  }
}