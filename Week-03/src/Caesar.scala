import scala.io.StdIn._

object Caesar {
   def main(args: Array[String]): Unit = {

   println("Enter your character: ")
   var character: Char = readChar().toLower
   
   println("How many character does it have to be shifted by? ")
   var shifted: Int = readInt()
   
   var encrypted: Char = ((((character + shifted) - 97) % 26) + 97).toChar
   
   println("You entered " + character + " and it shifted to " + encrypted)
  }
}