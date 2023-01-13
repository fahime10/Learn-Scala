

object Counter2 {
  private var counter: Int = 0
  
  def getValue2: Int = counter
  
  def inc() {
    counter = counter + 1
  }
  
  def inc(n:Int) {
    for(i <- 1 to n) inc()
  }
  
  def setValue(newValue:Int) {
    counter = newValue
  }
  
  def reset() {
    counter = 0
  }
}

object UseCounter2 {
  
  def main(args: Array[String]): Unit = {
    println(Counter2.getValue2)
    Counter2.inc()
    println(Counter2.getValue2)
    Counter2.inc()
    Counter2.inc()
    Counter2.reset
    println(Counter2.getValue2)
    Counter2.inc(5)
    println(Counter2.getValue2)
    Counter2.setValue(10)
    println(Counter2.getValue2)
  }
}