

object useItem {
  def main(args: Array[String]): Unit = {
    var items = List[Item]()
    
    val i1: Item = new Item("Chocolate", 5)
    val i2: Item = new Item("Cheese", 10, 95)
    val i3: Item = new Item("Beef", 7, 98)
    val i4: Item = new Item("Biscuit", 4, 95)
    
    items = List(i1,i2,i3,i4)
    
    items.foreach(x => println(x.getName + "  £" + x.getPrice))
    
    println()
    
    items.foreach(x => x.getPounds)
  }
}