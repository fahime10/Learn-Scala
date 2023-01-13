

object LimitCounter {
  private var counter: Int = 0
  private var lower: Int = 0
  private var upper: Int = 10
  
  def reset(lo:Int, up:Int) {
    lower = lo
    upper = up
    counter = lo
  }
  
  def setLowerLimit(lo:Int) {
    if (lo < upper) {
    lower = lo
    if (counter < lower)
      counter = lower
    } else println("Lower limit cannot be above the upper limit " + upper + ", please try again")
  }
  
  def setUpperLimit(up:Int) {
    if (up > lower) {
    upper = up
    if (counter > upper)
      counter = upper
    } else println("Upper limit cannot be below the lower limit " + lower + ", please try again")
  }
  
  def setToLowerLimit() {
    counter = lower
  }
  
  def setToUpperLimit() {
    counter = upper
  }
  
  def inc() {
    if (counter < upper && lower == 0)
    counter += 1
    else if (lower != 0 && counter <= (upper - lower))
      counter += 1
  }
  
  def dec() {
    if (upper > counter && upper >= 0)  
    counter -= 1
    else if (upper < 0 && counter <= (lower-upper))
      counter -= 1
  }
  
  
  def getLowerLimit: Int = lower
  
  def getUpperLimit: Int = upper
  
  def getValue: Int = counter
  
  def isAtLowerLimit: Boolean = {
    if (counter == lower)
      true
    else 
      false
  }
  
  def isAtUpperLimit: Boolean= {
    if (counter == upper)
      true
    else 
      false
  }
  
  def setValue(newValue:Int) = {
    if (newValue >= lower && newValue <= upper) counter = newValue
    else println("New counter does not fall within the limits, please try again")
  }
  
}