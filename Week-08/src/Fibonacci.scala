

object Fibonacci {
  def main(args: Array[String]): Unit = {
    var fibs = new Array[Int](40)
    
    fibs(0) = 1
    fibs(1) = 1
    
    
    var i = 2
    while (i < fibs.length) {
      fibs(i) = fibs(i-2) + fibs(i-1)
      i += 1
    }
    
    i = 0
    while (i < fibs.length) {
      if (i == fibs.length - 1)
        print(fibs(i))
         else if (i < fibs.length)
         print(fibs(i) + ", ")
         i += 1
  }
    }
}