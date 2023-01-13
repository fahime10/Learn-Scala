
import scala.io.StdIn.readChar

object LettersMatch {
  def main(args: Array[String]): Unit = {
    println("Type in a character: ")
    var char: Char = readChar()
    
    char = char.toLower
    
    if (char >= 'a' && char <= 'z') {
    
    char match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => println("VOWEL")
      case _ => println("CONSONANT")
    }
    
    } else {
      println("Character is non-alphabetic")
    }
  }
}
    // teacher's method
    /**var vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')

    print("Enter a Character ")
    var myChar = readChar()

    var message = myChar.isLetter match {
      case true => vowel.contains(myChar.toLower) match {
        case true => "Character '" + myChar + "' is VOWEL"
        case _    => "Character '" + myChar + "' is CONSONANT"
      }
      case _ => "Character '" + myChar + "' is non-alphabetic"
    }

    println(message)*/