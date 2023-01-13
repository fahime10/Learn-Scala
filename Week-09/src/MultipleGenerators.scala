

object MultipleGenerators {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5; y <- 1 to 2) {
      println("x: " + x + ", y: " + y) 
    }
    
    println()
    
    var xs = for (x <- ('a' to 'd').toList; y <- 'a' to 'e') yield x + "" + y
    println(xs)
  }
}

// speech marks are necessary so that it doens't get converted into
// ASCII values.