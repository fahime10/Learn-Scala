

object CircleCalc2 {
  def main(args: Array[String]): Unit = {
    var pi = scala.math.Pi
    var radius: Double = 12.5
    
    print("A circle with diameter " + f"${radius * 2}%2.0f")
    print(" has a circumference of " + f"${pi * radius * 2}%1.2f")
    
    //Use curly braces to make the code work. Using normal brackets will only display an error.
  }
}