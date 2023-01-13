import scala.io.StdIn._

object Relational {
  def main(args: Array[String]): Unit = {
    println("Enter an integer number ")
    var num1: Int = readInt()
    
    println("Enter your second integer number ")
    var num2: Int = readInt()
    
    println("\n" + num1 + " < " + num2 + " is " + (num1 < num2))
    println(num1 + " > " + num2 + " is " + (num1 > num2))
    println(num1 + " <= " + num2 + " is " + (num1 <= num2))
    println(num1 + " >= " + num2 + " is " + (num1 >= num2))
    println(num1 + " == " + num2 + " is " + (num1 == num2))
    println(num1 + " != " + num2 + " is " + (num1 != num2))
  }
}