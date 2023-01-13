import scala.io.StdIn.readLine

object CharCount {
  def main(args: Array[String]): Unit = {
    println("Enter a sentence: ")
    var sentence = readLine()
    
    sentence = sentence.toLowerCase()
    
    var count = new Array[Int](26)
    
    for (x <- sentence if x.isLetter) {  // if 'a' is in the string, then the counter adds 1 in the 
      count(x-97) += 1                   // first index. The array itself doesn't know the alphabet. We are the ones 
    }                                    // implementing that.
    
    for (x <- 'a' to 'z') {
      println(x + ": " + count(x-97) + " ")
    }
  }
}