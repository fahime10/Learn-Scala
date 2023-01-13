

object SimpleLists {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List(4, 1, 8, 45, 3)
    
    println(xs) //this shows the whole list
    
    println(xs.head) //this shows the first element
    
    println(xs.tail) //this shows all the elements except for the first one
    
    println(xs.isEmpty) //this induces a Boolean value, checking whether the list is empty or not
    
    println(xs.tail.isEmpty)
    
    var xs2: List[Int] = xs.reverse
    
    println(xs2)
    
    println(xs.drop(2).reverse)
  }
}