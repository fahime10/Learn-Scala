

object FlatMap {
  def main(args: Array[String]): Unit = {
    var xs = List("apple","pear","banana","kiwi")
    
    var chars = for (x <- xs; y <- x) yield y
    println(chars)
    
    chars = for (x <- xs; y <- x.take(3)) yield y
    println(chars)
    
    chars = for (x <- xs; y <- x.take(3)) yield y.toUpper
    println(chars)
  
/** the first one is similar to flatten, this method converts a collection
of collections into a single collection of values.
The second one is similar to flatMap, which maps each input value into a collection and then
flattens it.
The third one is similar to flatMap followed by map, a map converts each input value into a corresponding
output value. */

    var ys: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    
    var nums: List[Int] = for (x <- ys; y <- x) yield y
    println(nums)
    
    nums = for (x <- ys; y <- x.drop(1)) yield y
    println(nums)
  }
}