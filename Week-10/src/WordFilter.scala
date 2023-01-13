import scala.io.StdIn._

object WordFilter {
  def main(args: Array[String]): Unit = {
    var strings = new Array[String](5)
    
    var i = 0
    while (i < strings.length) {
      println("Enter a word: ")
      strings(i) = readLine()
      i += 1
    }
    println("You entered: "+ strings.mkString(" "))
    
    println()
    
    var char = new Array[Char](5)
    
    var j = 0
    while (j < char.length) {
      println("Enter a character: ")
      char(j) = readChar()
      j += 1
    }
    println("The characters you entered are: " + char.mkString(" "))
    
    strings.filter(x => char.contains(x.head)).foreach(println)
  }
}