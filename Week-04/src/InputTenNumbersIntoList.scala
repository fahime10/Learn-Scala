import scala.io.StdIn._

object InputTenNumbersIntoList {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()
    
    println("First Number? ")
    xs = xs :+ readInt()
    
    println("Second number? ")
    xs = xs :+ readInt()
    
    println("Third number? ")
    xs = xs :+ readInt()
    
    println("Fourth number? ")
    xs = xs :+ readInt()
    
    println("Fifth number? ")
    xs = xs :+ readInt()
    
    println("Sixth number? ")
    xs = xs :+ readInt()
    
    println("Seventh number? ")
    xs = xs :+ readInt()
    
    println("Eight number? ")
    xs = xs :+ readInt()
    
    println("Ninth number? ")
    xs = xs :+ readInt()
    
    println("Tenth number? ")
    xs = xs :+ readInt()
    
    println(xs.reverse)
    
    //Teacher's extra answers
    println("\n\n ........ Using xs.reverse.foreach(print(_)) .........")
    xs.reverse.foreach(print(_))
    //"foreach is a function that receives a function
    
    println("\n\n ........ xs.reverse.foreach(x => print(x + 1 + \" \")) .........")
    xs.reverse.foreach(x => print(x + 1 + " "))
  }
}