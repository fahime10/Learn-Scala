// BigInt is a data type that represents unbounded integers which cannot overflow.
import scala.io.StdIn.readInt


object fibonacci {
  def fibonacci(n: BigInt): BigInt = 
    if (n==0) 0
    else if (n==1) 1
    else fib(0, 1, n-2)
    
  def fib(a: BigInt, b: BigInt, n: BigInt): BigInt = 
    if (n==0) a+b
    else fib(b, a+b, n-1)
      
  def main(args: Array[String]): Unit = {
    print("Enter an integer (greater than or equal to zero) for index: ")
    var n = readInt()
    println(fibonacci(n))
   }
}