

object Lottery1 {
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
      println(f"${i+1}%2d" + " (" + lottery(i) + ")\t| " + ("*" * lottery(i)))
      i += 1
  }
}
}