

object UseCounter {
  def main(args: Array[String]): Unit = {
    var counter1: Counter = new Counter()
    var counter2: Counter = new Counter()
    println("counter 1: " + counter1.getValue)
    counter1.incr
    println("counter 1: " + counter1.getValue)
    counter1.incr()
    counter1.incr()
    counter1.incr()
    println("counter 1: " + counter1.getValue)
    counter1.inc(10)
    println("counter 1: " + counter1.getValue)
    println()
    counter2.inc(5)
    println("counter 2: " + counter2.getValue)
    counter2.setValue(30)
    println("counter 2: " + counter2.getValue)
    counter2.reset
    println("counter 2: " + counter2.getValue)
  }
}