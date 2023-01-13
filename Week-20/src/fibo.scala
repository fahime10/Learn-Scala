import scala.io.StdIn.readInt

object fibo {
  def fibo(n: BigInt): BigInt = {
    if (n < 0) return 0
    else if (n==0) 0
    else if (n==1) 1
    else fibo(n-1) + fibo(n-2)
    
  }
  def main(args: Array[String]): Unit = {
    println("Enter an integer number: ")
    var num = readInt()
    
    print(fibo(num))
    
    println("\n")
    
    var t0 = System.nanoTime()
    var fib32 = fibo(32)
    var t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1-t0}ns")
    t0 = System.nanoTime()
    fib32 = fibo(32)
    t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1-t0}ns")
  }
}