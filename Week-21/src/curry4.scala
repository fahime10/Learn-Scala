

object curry4 {
  def bracket(left: String)(right: String)
  (whatever: String) = left + whatever + right
  
  def main(args: Array[String]): Unit = {
    var list = List("Hello", "World!", " ")
    
    var list2 = List("apple","pear","banana","peach")
    
    println(list map (bracket("[")("]")))
    println(list2 map (bracket("(")(")")))
  }
}
// on the bracket function, we applied the left and the right 
// first, then the list is taken as "whatever".