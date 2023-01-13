

object StringConcat {
  def main(args: Array[String]): Unit = {
    println("Is the value of 5+5 " + 5 + 5 + "?")
    println("Or is it " + (5 + 5) + "?")
    println("Or even " + "5" * 5 + "?")
    // the first line is concatenating the two numbers rather than calculating it./*
    // the second line is actually adding the numbers and it works because of the brackets./*
    // the third line is using the string 5 and because of the multiplication, it is multiplying the string 5.*/
     
  }
}