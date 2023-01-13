import scala.io.StdIn.readChar

object RelationalCharacters {
  def main(args: Array[String]): Unit = {
    println("Enter a character number ")
    var num1: Char = readChar()
    
    println("Enter your second character number ")
    var num2: Char = readChar()
    
    println("\n" + num1 + " < " + num2 + " is " + (num1 < num2))
    println(num1 + " > " + num2 + " is " + (num1 > num2))
    println(num1 + " <= " + num2 + " is " + (num1 <= num2))
    println(num1 + " >= " + num2 + " is " + (num1 >= num2))
    println(num1 + " == " + num2 + " is " + (num1 == num2))
    println(num1 + " != " + num2 + " is " + (num1 != num2))
  }
}