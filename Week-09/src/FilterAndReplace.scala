import scala.io.StdIn.readLine

object FilterAndReplace {
  def main(args: Array[String]): Unit = {
    println("Enter a sentence: ")
    var sentence = readLine()
    
    var filtered = for (x <- sentence) yield x
    println(filtered)
    
    var replaced = for (x <- sentence) yield if (x != ' ') x else '*'
    println(replaced)
    
    var lengths = for (word <- sentence.split(" ").toList) yield word.length
    println(lengths)
    //this code will split the sentence into an array of words and then yield the length of each into a list
    
    var change = for (x <- sentence if x.isLetter) yield if (x.isUpper)x.toLower else x.toUpper
      println(change)
  }
}