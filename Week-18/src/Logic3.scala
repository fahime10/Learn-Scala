

object Logic3 {
  def and(a: Int, b: Int): Int = 
    if (a == 1 & b == 1)
      1
    else if (a == 1 && b == 3 || a == 3 && b == 1)
      3
    else if (a == 3 && b == 3)
      3
    else if (a == 0 && b == 3 || a == 3 && b == 0)
      3
    else 
      0
      
   def or(a: Int, b: Int): Int = 
     if (a == 1 || b == 1)
       1
     else if (a == 0 && b == 0)
       0
     else if (a == 0 && b == 3 || a == 3 && b == 0)
       3
     else 
       3
       
   def not(a: Int): Int = 
     if (a == 1)
       0
     else if (a == 3)
       3
     else 
       1
    
    
  def main(args: Array[String]): Unit = {
    println("\ta" + "\t(not a)")
    println()
    println("\t1" + "\t" + f"${not(1)}%4d")
    println("\t0" + "\t" + f"${not(0)}%4d")
    println("\t3" + "\t" + f"${not(3)}%4d")
    
    println()
    println()
    
    println("\ta" + "\tb" + "\t(a and b)" + "\t(a or b)")
    println()
    println("\t1" + "\t1" + "\t" + f"${and(1,1)}%4d" + "\t\t" + f"${or(1,1)}%4d")
    println("\t1" + "\t0" + "\t" + f"${and(1,0)}%4d" + "\t\t" + f"${or(1,0)}%4d")
    println("\t0" + "\t1" + "\t" + f"${and(0,1)}%4d" + "\t\t" + f"${or(0,1)}%4d")
    println("\t0" + "\t0" + "\t" + f"${and(0,0)}%4d" + "\t\t" + f"${or(0,0)}%4d")
    println("\t1" + "\t3" + "\t" + f"${and(1,3)}%4d" + "\t\t" + f"${or(1,3)}%4d")
    println("\t0" + "\t3" + "\t" + f"${and(0,3)}%4d" + "\t\t" + f"${or(0,3)}%4d")
    println("\t3" + "\t1" + "\t" + f"${and(3,1)}%4d" + "\t\t" + f"${or(3,1)}%4d")
    println("\t3" + "\t0" + "\t" + f"${and(3,0)}%4d" + "\t\t" + f"${or(3,0)}%4d")
    println("\t3" + "\t3" + "\t" + f"${and(3,3)}%4d" + "\t\t" + f"${or(3,3)}%4d")
  }
}