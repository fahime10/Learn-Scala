import scala.io.StdIn.readInt

object FlatMapCaesar {
  def main(args: Array[String]): Unit = {
    var words = Array("Mse", "crete", "t", "messiah", "s", "ageing")
    
    print("Enter a rotation value: ")
    var shift = readInt()
    
    var letters = words.flatMap(x => x.take(3)).filter(x => x.isLower)
    
    
    println(letters.mkString(" "))
    println()
    
    var shiftedLetters = letters.map(x => (x + shift).toChar)
    
    println(shiftedLetters.mkString(" "))
    
    println()
    
    (0 until letters.length).foreach(x => println(letters(x) + " -> " + shiftedLetters(x)))
  }
}