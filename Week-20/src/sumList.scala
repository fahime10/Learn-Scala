

object sumList {
  def sumList(xs: List[Int]): Int = 
    if (xs.isEmpty) 0
    else xs.head + sumList(xs.tail)
    
  def prodList(xs: List[Int]): Int = 
    if(xs.isEmpty) 1
    else xs.head * prodList(xs.tail)
      
  def lenList(xs: List[Int]): Int =
    if (xs.isEmpty) 0
    else xs.length
   
    
  def allTrue(xs: List[Boolean]): Boolean =
    if (xs.isEmpty) false
    else if (xs.contains(false)) false
    else true
    
  def anyTrue(xs: List[Boolean]): Boolean =
    if (xs.isEmpty) false
    else if (xs.contains(true)) true
    else false
    
    def main(args: Array[String]): Unit = {
      println("Using sumList: ")
      println(sumList(List()))
      println(sumList(List(1)))
      println(sumList(List(2,4,7,9)))
      println(sumList((1 to 20).toList))
      println(sumList(List(2147483647,2147483647)))
      println()
      println("Using prodList: ")
      println(prodList(List()))
      println(prodList(List(2,3,4)))
      println(prodList((1 to 10).toList))
      println(prodList(List(2147483647,2)))
      println()
      println("Using lenList: ")
      println(lenList(List()))
      println(lenList(List(2,3,4,5)))
      println()
      println("Using allTrue: ")
      println(allTrue(List()))
      println(allTrue(List(true,true,true)))
      println(allTrue(List(true,false,true)))
      println(allTrue(List(false)))
      println()
      println("Using anyTrue: ")
      println(anyTrue(List()))
      println(anyTrue(List(true,true)))
      println(anyTrue(List(true,false,false)))
      println(anyTrue(List(false,false)))
    }
}