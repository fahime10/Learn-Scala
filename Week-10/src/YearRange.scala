import scala.io.StdIn.readInt

object YearRange {
  def main(args: Array[String]): Unit = {
    println("Enter your year of birth: ")
    
    var year = readInt()
    
    var year1 = (year to 2020)
    year1.filter(_ % 4 != 0).foreach(x => println(x))
  }
}
/** teacher method:

(year to 2020).filter(x => !(x % 4 == 0)).foreach(println) */