import scala.io.StdIn.readInt

object DynamicArrays {
  def main(args: Array[String]): Unit = {
    println("How many numbers would you like to store? ")
    var size = readInt()
    
    var nums = new Array[Int](size)
    
    var i = 0
    while (i < nums.length) {           //this allows to input value depending upon the no. of values you wanted
      println("Number " + (i+1) + " ? ")
      nums(i) = readInt()
      i += 1
    }
    
    println("\nSmallest number: ")    // this will show the smallest integer you inputted
    var smallest = nums(0)
    i = 1
    while (i < nums.length) {
      if (nums(i) < smallest) {      // it will check for each index and select the smallest integer present
        smallest = nums(i)
      }
      i += 1
    }
    println(smallest)
    
    println("\nIndex of largest number: ")
    var largestIndex = 0
    var largest = nums(0)           // this will check at each index and select the largest integer inputted, then
    i = 1                           // it will print out the index that has the largest integer
    while (i < nums.length) {
      if (nums(i) > largest) {
        largest = nums(i)
        largestIndex = i
      }
      i += 1
    }
    println(largestIndex)
    
    println("\nNumber of negative numbers: ")
    var count = 0
    i = 0
    while (i < nums.length) {
      if (nums(i) < 0) {
        count += 1
      }
      i += 1
    }
    println(count)                             // this counts the number of negative integers inputted
    
    println("\nThe average of your numbers is: ")
    var avg = nums.toList
    println(avg.sum / size)
    
    
    println("\nSearch for which number? ")     // based on the values you inputted, if you then input a value you already inputted
    var lookup = readInt()                     // it will display as true, which indicates it exists in the array
    var found = false
    i = 0
    while (i < nums.length) {
      if (nums(i) == lookup) {
        found = true
      }
      i += 1
    }
    println("Number found? " + found)
    
  } 
}