import scala.io.StdIn._

object MyFuns2 {
  
  /*def prime(x: Int) : Boolean = {
    if(x <= 1) {      
      for(i <- 2 to x) {        
        if(x % i == 0)     
          return false
        else return true
      }
      return true
    }    
    else true
  }*/
  
  def prime(x: Long): Boolean = {
    (x == 2) || (x > 1) && (x % 2 == 1) && ((3 to
        Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))
  }
  
/*  def perfect(x: Long): Boolean = {
    var result : Int = 0
    for(j <- 1 to x.toInt){
      if(x % j == Int){
        result += j
        if(result == x){
          return true
        } else
          return false
      }
    }
    return true
  }*/
  
  def perfect (x : Int) : Boolean = ((1 until x) filter(x%_ == 0)).sum == x  
    
  def digitToWord(x: Int): String = {
    x match {
      case '0' => "zero"
      case '1' => "one"
      case '2' => "two"
      case '3' => "three"
      case '4' => "four"
      case '5' => "five"
      case '6' => "six"
      case '7' => "seven"
      case '8' => "eight"
      case '9' => "nine"
      case _ => "bad digit"
  }
  }
    
  def wordToDigit(x: String): Int = {
    x match {
      case "one" => 1
      case "two" => 2
      case "three" => 3
      case "four" => 4
      case "five" => 5
      case "six" => 6
      case "seven" => 7
      case "eight" => 8
      case "nine" => 9
      case _ => -1
    }
  }
  
  def leapYear(x:Int): Boolean = {
    if (x % 400 == 0) 
      true
    else if (x % 100 == 0)
      false
    else if (x % 4 == 0)
      true
    else 
      false
  }
  
   def main(args: Array[String]): Unit = {
     println(prime(5))
     println(prime(14))
     
     println()
     
     println(perfect(8128))
     
     println()
     
     println("Enter an integer between 0 and 9: ")
     var int = readChar()
     println(digitToWord(int))
     
     println()
     
     println("Enter (in lowercase) an integer between 0 and 9 using a word: ")
     var int1 = readLine().toLowerCase()
     println(wordToDigit(int1))
     
     println()
     
     println("Enter a number that you think may be a leap year according to the Gregorian calendar: ")
     var int3 = readInt()
     println(leapYear(int3))
   }
}