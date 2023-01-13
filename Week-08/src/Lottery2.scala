

object Lottery2 {
  def main(args: Array[String]): Unit = {
    var lottery = Array(23,16,18,19,26,13,22,    
                        20,14,22,18,21,15,17,    
                        24,15,18,20,13,14,20,    
                        18,22,20,16,19,11,20,    
                        16,28,22,20,15,17,17,   
                        21,21,19,20,14,22,25,    
                        19,17,26,18,20,23,12)
                        
    var i = 0
    while (i < lottery.length) {
      print(f"${i+1}%2d" + " (" + lottery(i) + ")\t|" + ("_" * lottery(i) + "|"))
      if (i != lottery.length - 1 && lottery(i) < lottery(i+1)) {       
        print("_" * (lottery(i+1) - lottery(i) - 1))
      }
      println()
      i += 1
    }
    
  }
} /** take for example index 1, which is 16, this works for the if statement, where index 1 is less than the lottery length
      and the index taken in consideration is less than the next index. So we are telling the program to extend with an underscore
      on index 1. The calculation is 18 - 16 - 1 in this case, only one underscore is added. */  