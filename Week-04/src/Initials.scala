import scala.io.StdIn._

object Initials {
  def main(args: Array[String]): Unit = {
    println("Enter your full name: ")
    var fullName: String = readLine()
    
    var initial1: Char = fullName.charAt(0).toUpper
    var space: Int = fullName.indexOf(" ")
    var initial2: Char = fullName.charAt(space + 1).toUpper
    
    println("\nYour initials are: " + initial1 + initial2)
    
    var email: String = "@email.dmu.ac.uk"
    var surname: String = fullName.substring(space + 1)
    email = initial1.toLower + "." + surname.toLowerCase() + email
    
    println("\nYour email is: " + email)
  }
}