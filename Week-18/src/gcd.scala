

object gcd {
  def gcd(x: Int, y: Int): Int = {
    var a: Int = x
    var b: Int = y
    
    while(a != b) {
      if (a < b)
        b = b - a
      else 
        a = a - b
    }
    return a
  }
    
    def main(args: Array[String]): Unit = {
      println(gcd(1200,1300))
  }
}