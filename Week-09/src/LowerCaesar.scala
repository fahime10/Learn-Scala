import scala.io.StdIn._

object LowerCaesar {
  def main(args: Array[String]): Unit = {
    var str = readLine("Enter a string that you want to encrypt: ")
    str = str.toLowerCase()
    
    print("Enter the value that you want to shift by: ")
    var shift = readInt()
    
    var encrypted = for (x <- str if x.isLower) yield (x + shift).toChar
    println(encrypted)
}
}