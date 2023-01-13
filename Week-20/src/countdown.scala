

object countdown {
  def countdown(n : Int): Unit = {
    print(s"$n ")
    if (n == 0)
      println("Stopped")
    else
      countdown(n-1)
  }
  
  def countTo10(n: Int) : Unit = {
    print(s"$n ")
    if (n == 10)
      println("Stopped")
    else 
      countTo10(n+1)
  }
  
  def countToN(x: Int, y: Int): Unit = {
    print(s"$x ")
    if (x == y)
      println("Stopped")
    else
      countToN(x+1, y)
  }
  
  def reverseCountToN(x: Int, y: Int): Unit = {
    print(s"$y ")
    if (y == x)
      println("Stopped")
    else
      reverseCountToN(x, y-1)
  }
  
  def main(args: Array[String]): Unit = {
    countdown(10)
    println()
    countTo10(5)
    println()
    countToN(17, 25)
    println()
    reverseCountToN(17,25)
  }
}

/* Recursion is about a function calling itself until the stopping condition has been met.
   When 10 is first inputted, it has not yet finished executing and it will only finish 
   when 9 has finished.
   So, when the countdown reaches zero, control is passed back to the suspended countdown,
   which should be countdown(1), then countdown(2) and so on, until it reaches countdown(10).


   def factorial(n: Long): Long = {  
   if (n == 0)
      1  
   else    
     n * factorial(n - 1)
   }

  factorial(5)
  = 5 * factorial(4)
  = 5 * (4 * factorial(3))
  = 5 * (4 * (3 * factorial(2)))
  = 5 * (4 * (3 * (2 * factorial(1))))
  = 5 * (4 * (3 * (2 * (1 * factorial(0)))))
  = 5 * (4 * (3 * (2 * (1 * 1))))
  = 5 * (4 * (3 * (2 * 1)))
  = 5 * (4 * (3 * 2))
  = 5 * (4 * 6)
  = 5 * 24
  = 120     */