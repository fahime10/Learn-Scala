import scala.io.StdIn.readDouble

object CircleCalc {
  def main(args: Array[String]): Unit = {
    println("Input any number for the radius of the circle :")
    var pi = scala.math.Pi
    var radius: Double = readDouble()
    
    var circumference: Double = radius * 2 * pi
    
    print("A circle with diameter" + f"${radius * 2}%2.0f")
    print(" has a circumference of " + (f"$circumference%1.2f"))
  }
}