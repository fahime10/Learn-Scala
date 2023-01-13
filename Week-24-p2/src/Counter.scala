

class Counter {
  
  private var value: Int = 0
  
  def incr(): Unit = {   // mutator method (change the state)
    value += 1
  }
  
  def getValue(): Int = {  // accessor method (access the state)
    return value
  }
  
  def inc(n: Int) {
    for (i <- 1 to n) incr()
  }
  
  def setValue(n: Int) {
    value = n
  }
  
  def reset() {
    value = 0
  }
}