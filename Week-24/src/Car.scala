

class Car(private var colour: String, private var make: String,
    private var maxSpeed: Int, private var currentSpeed: Int) {  // this is the default constructor
  
  def this(colour: String, make :String, maxSpeed: Int) = {   //this is an auxiliary constructor
    this(colour, make, maxSpeed, 0)
  }
  
  def this(colour: String, make: String) = {
    this(colour, make, 150)
  }
  
  def accelerate {
    if(currentSpeed < maxSpeed)
      currentSpeed += 1;
  }
  
  def getInfo: String = s"Your $colour $make drives at $currentSpeed, but could go $maxSpeed if you want"
  
}