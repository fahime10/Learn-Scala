

object SimpleStrings {
  def main(args: Array[String]): Unit = {
    var s1: String = "Dealing with strings"
    var s2: String = "Playing"
    var s3: String = s2 + s1.substring(7)
    
    println(s3)
    println(s3.toUpperCase)
    println(s3.substring(0, 7))
    println(s3.startsWith(s2))
    println(s3.endsWith(s1)) //this gives a false value because there is a range
    println("\n" + s3.substring(0,13) + s3.substring(13,14).toUpperCase +
        s3.substring(14))
    
    //Teacher's extra answers
    println("\n\n .... Using only substring and toUpperCase ....")
    println(s3.substring(0, 13) + s3.substring(13, 14).toUpperCase + s3.substring(14))

    println("\n\n .... Using other methods ....")
    println(s3.substring(0, s3.indexOf('s')) + s3.charAt(s3.indexOf('s')).toUpper + 
        s3.substring(s3.indexOf('s') + 1))
  }
}