import scala.io.StdIn.readInt

object SortThree {
  def main(args: Array[String]): Unit = {
    print("Enter your first integer: ")
    var a = readInt()
    
    print("Enter your second integer: ")
    var b = readInt()
    
    print("Enter your third integer: ")
    var c = readInt()
    
    if (a < b) {
      if (b < c) {
        println(a + " " + b + " " + c)
      } else if (c < a) {
        println(c + " " + a + " " + b)
      } else {
        println(a + " " + c + " " + b)
      }
    } else if (b < a) {
      if (a < c) {
        println(b + " " + a + " " + c)
      } else if (c < b) {
        println(c + " " + b + " " + a)
      } else {
        println(b + " " + c + " " + a)
      }
    }
  }
}