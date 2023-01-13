

class LimitCounter() {
  private var lowLim: Int = 0
  private var upLim: Int = 10
  private var counter: Int = 0
      
  def this(lo: Int, up: Int) = {     
    this()                           
    lowLim = lo
    upLim = up
    counter = lo                       
  }
  
    def this(lo: Int, up: Int, value: Int) = {
    this(lo, up)
    if(value < lowLim || value > upLim)
      counter = lo
    else
    counter = value
  }
  
  def reset(lo: Int, up: Int) {
    lowLim = lo
    upLim = up
    counter = lo
  }
  
  def setLowerLimit(lo: Int) {
    if(lo < upLim)
      lowLim = lo
    if(counter < lowLim)
      counter = lowLim
    else println("Lower limit cannot be above upper limit " + upLim + ", please try again")
  }
  
  def setUpperLimit(up :Int) {
    if(up > lowLim)
      upLim = up
    if(counter > upLim)
      counter = upLim
    else println("Upper limit cannot be below the lower limit " + lowLim + ", please try again")
  }
  
  def setToLowerLimit() {
    counter = lowLim
  }
  
  def setToUpperLimit() {
    counter = upLim
  }
  
  def inc() {
    if(counter == upLim) counter = lowLim
    else counter += 1
  }
  
  def incr(n: Int) {
      for (i <- 1 to n)
        inc()
  }
  
  def dec() {
    if(counter == lowLim) counter = upLim
    else counter -= 1
  }
  
  def decr(n: Int) { 
      for(i <- n to 1 by -1)
        dec()
  }
  
  def getLowerLimit: Int = lowLim
  
  def getUpperLimit: Int = upLim
  
  def getValue: Int = counter
  
  def isAtLowerLimit: Boolean = {
    if(counter == lowLim)
      true
    else 
      false
  }
  
  def isAtUpperLimit: Boolean = {
    if(counter == upLim)
      true 
    else
      false
  }
    
}