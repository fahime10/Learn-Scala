

object factorial {
  def factorial(x: Long): Long = {
    if (x == 0)
      1
    else 
      x * factorial(x-1)
  }
  
  def main(args: Array[String]): Unit = {
    print(factorial(20) + " ")
  }
}

/* When using Long data type, we can go as far as factorial 20.
   With 21, the result becomes negative as it cycles the data type.
   We cannot input negative values as the loop would be infinite. */