import scala.io.StdIn._

object LogicalOperators {
  def main(args: Array[String]): Unit = {
   println("Input true or false: ")
   var inp1: Boolean = readBoolean() 
   
   println("Input true or false: ")
   var inp2: Boolean = readBoolean()
   
   println("\n" + inp1 + " AND " + inp2 + " is " + (inp1 && inp2))
   println(inp1 + " OR " + inp2 + " is " + (inp1 || inp2))
   
   println("\nTruth Tables: ")
   println("true && true " + "\t" + (true && true))
   println("true && false " + "\t" + (true & false))
   println("false && true " + "\t" + (false && true))
   println("false && false " + "\t" + (false && false))
   println("\ntrue || true " + "\t" + (true || true))
   println("true || false " + "\t" + (true || false))
   println("false || true " + "\t" + (false || true))
   println("false || false " + "\t" + (false || false))
       
  }
}