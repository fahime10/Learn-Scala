
import scala.io.StdIn.readChar

object Letters {
  def main(args: Array[String]): Unit = {
    println("Type in a character: ")
    var char: Char = readChar()
    
    char = char.toLower
    
    if (char.isLetter) {
      if (char == 'a') {
        println("Vowel")
      } else if (char == 'e') {
        println("Vowel")
      } else if (char == 'i') {
        println("Vowel")
      } else if (char == 'o') {
        println("Vowel")
      } else if (char == 'u') {
        println("Vowel")
      } else {
        println("Consonant")
      }
    } else {
      println("Non-alphabetical character")
    }
    }
  }