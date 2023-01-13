import scala.io.StdIn._

object LetterCaesar {
  def main(args: Array[String]): Unit = {
  println("Type in a sentence that you want to encrypt: ")
  var sent: String = readLine().toLowerCase()
  
  println("Enter a character that you want to encrypt: ")
  var char: Char = readChar().toLower
  
  println("Enter your shift value: ")
  var shift: Int = readInt()
  
  var encrypt: Char = ((((char + shift) - 97) % 26) + 97).toChar
  var encryptedsent = sent.replace(char, encrypt)
  
  println("Your encrypted sentence is: " + encryptedsent)
  
  }
}