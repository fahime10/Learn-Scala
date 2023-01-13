import scala.io.StdIn.readInt

object Ackermann {
  /*def ackermann(m: Int, n: Int): Int = 
    if (m==0) n+1
    else if(n==0) ackermann(m-1,1)
    else ackermann(m-1, ackermann(m,n-1))*/
  
  def ackermann(a: Int, b: Int): Int = 
    if (a==0)
      b+1
    else if (a > 0 && b > 0)
      ackermann(a - 1 , 1)
      else 
        ackermann(a-1,ackermann(a,b-1))
  
  def main(args: Array[String]): Unit = {
    print("Enter first integer: ")
    var a: Int = readInt()
    print("Enter second integer: ")
    var b: Int = readInt()
    println(ackermann(a,b))
    println(ackermann(0,4))
    println(ackermann(0,0))
    println(ackermann(0,3))
    println(ackermann(0,5))
}
}