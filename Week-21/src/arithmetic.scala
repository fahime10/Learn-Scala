

object arithmetic {
  def add(x: Int)(y: Int) = x+y
  //val add: Int => (Int => Int) = x => (y => x+y)
  
  def add2(x:Int, y:Int): Int = x+y
  
  def sub(x: Int)(y: Int) = x-y
  
  def mul(x: Int)(y: Int) = x*y
  
  def div(x: Int)(y: Int) = x/y
  
  def mod(x: Int)(y: Int) = y%x
  
  def main(args: Array[String]): Unit = {
    print((1 to 10) map (add(2)))
    println()
    print((1 to 5) map (sub(10)))
    println()
    print((1 to 5) map (mul(2)))
    println()
    print((1 to 5) map (div(2)))
    println()
    print((10 to 1 by -1) map (mod(2)))

    //print((1 to 10) map (add2(2)) cannot work as it needs two direct inputs
  }
}