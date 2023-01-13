import scala.io.StdIn._

object InOutStrings {
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    
    print("Enter your initial ")
    var initial: Char = readChar()
    
    var lastName: String = readLine("Enter your last name ")
    
    print("Enter your house number ")
    var houseNo: Int = readInt()
    
    print("Enter your address ")
    var address: String = readLine()
    
    print("Enter your telephone number ")
    var telNo: Int = readInt()
    
    print("Enter your salary ")
    var salary: Double = readDouble()
    
    println("\n\nYour name is " + firstName + " " + lastName)
    println("Your initial is " + initial)
    println("Your address is " + houseNo + " " + address)
    println("Your telephone number is " + telNo)
    println("Your salary is £" + salary)
  }
}