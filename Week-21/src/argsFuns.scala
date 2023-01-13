

object curry5 {
  def lt(x: String, y: String): Boolean = { // the mistake I did was that I used a currying format when it wasn't required
    lastName(x) < lastName(y)
  }
    
  def lastName(name: String): String = {
      name.split(" ")(1)
  }
  
  def main(args: Array[String]): Unit = {
    println(List("Stefan Kuhn", "Luke Attwood", "Usama Mannai", "Stuart O'Connor", "Bello Bello").sortWith(lt))
    
  }
}
    /* var list = List("Stefan Kuhn", "Luke Attwood", "Usama Mannai",
        "Stuart O'Connor", "Bello Bello")
  var space: Int = list.indexOf(" ")      
  var list2 = list.toString().substring(space + 1)
  var list3 = List("Kuhn", "Attwood", "Mannai", "O'Connor", "Bello")
    
    //println(list2 name(list))
    println(list.sortWith(_.compareTo(_) < 0))
    println(List("Steve", "Tom", "John", "Bob").sortWith(_.compareTo(_) < 0))
    println(list3.sortWith(_.compareTo(_) < 0)) */  
  
  //def name(x: String)(y: String) = 
    //x + " " + y.sortWith(_.compare(_) < 0)