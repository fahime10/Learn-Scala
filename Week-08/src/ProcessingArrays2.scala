import scala.io.StdIn.readLine

object ProcessingArrays2 {
  def main(args: Array[String]): Unit = {
    println("Enter 10 strings/words individually: ")
    var str = new Array[String](10)
    
    var i = 0
    while (i < str.length) {
      println("Word number " + (i+1) + " ?")   //the println is what stops it from looping forever
      str(i) = readLine()
      i += 1
    }
    
    i = 0
    while (i < 10) {
      print(str(i) + " ")
      i += 1
    }
  }
}