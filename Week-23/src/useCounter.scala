

object useCounter {
  def main(args: Array[String]): Unit = {
    println(counter.getValue)
    counter.incr
    println(counter.getValue)
  }
}
// no input has been applied to the function.
// This works because the functions are just waiting to be used
// and they change the state using the underlined object, being counter.