import scala.io.StdIn.readInt

object ModuleResults {
  def getResult : (Int,Int) => String = (x,y) => 
    if (x < 0 || x > 100) {
    "invalid input"
    } else if (y < 0 || y > 100) {
      "invalid input"
      } else if ((x >= 0 && x <= 100) && (y >= 0 && y <= 100)) {
        
      if (x >= 40 && y >= 40)
      "passed"
        else if (x < 40 && y >= 40)
      "resit coursework"
        else if (x >= 40 && y < 40)
      "resit examination"
        else 
      "resit module"
      }  else 
      "invalid input"
    
  def main(args: Array[String]): Unit = {
      print("Enter the percentage score for the coursework: ")
       var a = readInt()
 
      print("Enter the percentage score for the examination: ")
       var b = readInt()
    
    println("The overall percentage score is: " + (a + b) / 2)
    println(getResult(a,b))
  }
}