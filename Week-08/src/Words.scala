import scala.io.StdIn._

object Words {
  def main(args: Array[String]): Unit = {
    println("How many words would you like to store? ")
    var size = readInt()
    
    var words = new Array[String](size)
    
    var i = 0
    while (i < words.length) {
      println("Word number " + (i+1) + "?")
      words(i) = readLine()
      i += 1
    }
    
    i = 0
    while (i < words.length) {
      print((words(i) + " ").toUpperCase())
      i += 1
    }
    
    i = 0
    var sum = 0
    while (i < words.length) {
      sum += words(i).length
      i += 1
    }
    
    var avg = sum / words.length
    
    println("\nThe average word length is: " + avg )
    
  }
}