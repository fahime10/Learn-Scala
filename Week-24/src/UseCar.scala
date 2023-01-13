

object UseCar {
  def main(args: Array[String]): Unit = {
    val c1: Car = new Car("silver", "Opel")
    val c2: Car = new Car("black", "Mercedes", 200, 50)
    val c3: Car = new Car("faded blue", "Trabant", 80)
    val c4: Car = new Car("white", "Lamborghini")
    println(c1.getInfo)
    println(c2.getInfo)
    println(c3.getInfo)
    println(c4.getInfo)
    
    for(i <- 0 to 300)
      c1.accelerate
      
    println(c1.getInfo)
  }
}