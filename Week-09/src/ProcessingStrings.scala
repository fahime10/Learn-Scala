import scala.io.StdIn.readLine

object ProcessingStrings {
  def main(args: Array[String]): Unit = {
    println("Type in a sentence: ")
    var sentence = readLine()
    
    for (x <- sentence) {
      println(x)
    }
    
    var letterCount = 0
    for (x <- sentence if x.isLetter) {   //the if clause is a guard, which acts as a filter.
      println("Letter: " + x)
      letterCount += 1
    }
    
    println("Number of letters: " + letterCount)
    
    
    var numberCount = 0
    for (y <- sentence if y.isDigit) {
      println("Number inputted: " + y)
      numberCount += 1
    }
    
    println("Amount of numbers: " + numberCount)
  }
}