

object counter {
  private var value: Int = 0
  
  def incr{
    value+=1
  }
  
  def getValue: Int = {
    return value
  }
}
/* the private clause will encapsulate the value, so that 
   it can only be used in this object.
   An object is data combined with code working with data.
   The data (called attributes) define the state of the object, the code which 
   can change the state.
   Code is in functions, which are called methods, since they are part of an object. */