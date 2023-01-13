import scala.io.StdIn.readInt

object YearOfBirth {
  def main(args: Array[String]): Unit = {
    print("Enter your year of birth: ")
    var year = readInt()
    
    var year1 = for (x <- (year to 2020).toList) yield x
    
    println()
    
    for (x <- year1) {
    println(x)
}
}
}