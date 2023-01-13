

object UseLimitCounter {
  def main(args: Array[String]): Unit = {
    println("The current lower limit is: " + LimitCounter.getLowerLimit)
    println("The current upper limit is: " + LimitCounter.getUpperLimit)
    println()
    LimitCounter.setLowerLimit(20)
    println(LimitCounter.getValue)
    LimitCounter.inc()
    println(LimitCounter.getValue)
    LimitCounter.dec()
    println(LimitCounter.getValue)
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    println(LimitCounter.getValue) // this has gone beyond the limit, but answer remains the same
    LimitCounter.setToLowerLimit()
    println()
    
    println(LimitCounter.getValue)
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.inc()
    LimitCounter.dec()
    println(LimitCounter.getValue)
    LimitCounter.setToUpperLimit()
    println(LimitCounter.isAtUpperLimit)
    println(LimitCounter.isAtLowerLimit)
    LimitCounter.reset(1, 30)
    println(LimitCounter.getLowerLimit + " " + LimitCounter.getUpperLimit)
    LimitCounter.setLowerLimit(5)
    println(LimitCounter.getValue)
  }
}