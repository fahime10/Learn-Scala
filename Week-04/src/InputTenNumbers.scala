import scala.io.StdIn._

object InputTenNumbers {
  def main(args: Array[String]): Unit = {
    println("Input first integer: ")
    var a: Int = readInt()
    
    println("Input second integer: ")
    var b: Int = readInt()
    
    println("Input the third integer: ")
    var c: Int = readInt()
    
    println("Input the fourth integer: ")
    var d: Int = readInt()
    
    println("Input the fifth integer: ")
    var e: Int = readInt()
    
    println("Input the sixth integer: ")
    var f: Int = readInt()
    
    println("Input seventh integer: ")
    var g: Int = readInt()
    
    println("Input eighth integer: ")
    var h: Int = readInt()
    
    println("Input ninth integer: ")
    var i: Int = readInt()
    
    println("Input tenth integer: ")
    var j: Int = readInt()
    
    println("------------")
    println("In reverse order, your numbers are: " + j + ", " + i + ", " + h + ", " +
        g + ", " + f + ", " + e + ", " + d + ", " + c + ", " + b + ", " + a)
        
  }
}