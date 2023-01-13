

object UseLimitCounter {
  def main(args: Array[String]): Unit = {
    val c1: LimitCounter = new LimitCounter(10, 20, 1)
    val c2: LimitCounter = new LimitCounter(20, 30)
    val c3: LimitCounter = new LimitCounter()
    val c4: LimitCounter = new LimitCounter(20, 30, 80)
    
    println(c1.getValue)
    println(c1.isAtLowerLimit)
    c1.incr(30)
    println("counter 1: " + c1.getValue)
    println("counter 3: " + c3.getValue)
    c3.dec()
    println("counter 3: " + c3.getValue)
    println("counter 2: " + c2.getValue)
    c2.setLowerLimit(50)
    println("counter 2: " + c2.getValue)
    println("counter 4: " + c4.getValue)
  }
}

/** in the previous lab, we could only use the object name to execute the program.
    With this technique, we can name instances and these will be independent from each other. **/