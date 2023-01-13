

class Item(private var name: String, private var price: Int, private var penny: Int) {
  
  def this(n: String, p: Int) = {
    this(n, p, 0)
  }
  
  def getName: String = name
  def getPrice = {
    price + "." + penny
  }
  
  def getPounds = {
    price
  }
}