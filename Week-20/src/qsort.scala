

object qsort {
  def qsort(xs: List[Int]): List[Int] = 
    if (xs.isEmpty) xs
    else {
      val lesser = xs.tail.filter(_ <= xs.head)
      val greater = xs.tail.filter(_ > xs.head)
      qsort(lesser) ++ (xs.head :: qsort(greater)) //the :: means adding the element at the beginning of the list
    }                                              //the ++ is an alias for concatenation
  
  def main(args: Array[String]): Unit = {
    print(qsort(List(40,60,2,13,8,20)))
    println()
    print(qsort(List(5,3,10,9,7,0)))
  }
}

/*
1) we have list(5,3,10,9,7,0), with val lesser, we get list(3,10,9,7,0), then we filter so that we obtain list(3,0), which goes through 
*  the function again to finally obtain list(0)
2) we have list(5,3,10,9,7,0), with val greater, we get list(3,10,9,7,0), then we filter so that we obtain list(10,9,7) which goes through
*  the function again, but cannot do the operation since 10 is the greatest
* 
* The way this function works is qsort(lesser) gives (0,3), then it's concatenated with the head of the list, which list(5),
* then we add this head to the qsort(greater) list, which is list(7,9,10)
*/