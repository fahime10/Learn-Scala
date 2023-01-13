import scala.io.StdIn._

object InOutStrings {
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    
    var lastName: String = readLine("Enter your last name ")
    
    var title: String = "Mr."
    
    println("Your name is " + title + " " + firstName + " " +lastName)
  }
}