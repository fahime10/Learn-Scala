import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    print("Enter start value of list ")
    var start = readInt()
    
    print("Enter end value of list (exclusive) ")
    var end = readInt()
    
    var xs = List.range(start, end)
    
    var cmd = ""
    
    do {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")
      
      cmd = readLine()
      
      if (cmd == "Take")  {
        println("Please provide an amount to take from")
        var am1 = readInt()
        
        println(xs.take(am1))
        
      } else if (cmd == "TakeR") {
        println("Please provide an amount to take from the right")
        var am2 = readInt()
        
        println(xs.takeRight(am2))
        
      } else if (cmd == "Drop") {
        println("Please provide with an amount that you want to remover from list")
        var am3 = readInt()
        
        println(xs.drop(am3))
        
      } else if (cmd == "DropR") {
        println("Please provide an amount that you want to remove from the list starting from the right")
        var am4 = readInt()
        
        println(xs.dropRight(am4))
      }
     }  while (cmd != "End")
     println("Exiting program..")
}
}