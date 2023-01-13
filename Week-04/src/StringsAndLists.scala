

object StringsAndLists {
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little", "lamb")
    
    (s1.foreach(x => (print(x.head.toUpper + " "))))
    
    //Down below are the teacher's answers and these highlight other methods that can be used to solve the problem
    println("\n\n .... Using charAt ....")
    s1.foreach(x => print(x.charAt(0).toUpper + " "))

    println("\n\n .... Using substring ....")
    s1.foreach(x => print(x.substring(0, 1).toUpperCase + " "))

    println("\n\n .... Accessing each word individually (different approaches) ....")
    var w1: String = s1.head
    var w2: String = s1(1)
    var w3: String = s1.tail.tail.head
    var w4: String = s1(3)
    var w5: String = s1.takeRight(1).head
    println(w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5)

    println("\n .... Accessing each letter individually (different approaches) ....")
    var c1: Char = w1.charAt(0)
    var c2: Char = w2.head.toUpper
    var c3: Char = w3.toUpperCase.charAt(0)
    var c4: String = w4.substring(0, 1).toUpperCase
    var c5: Char = w5.charAt(0).toUpper
    println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5)

    
  }
}