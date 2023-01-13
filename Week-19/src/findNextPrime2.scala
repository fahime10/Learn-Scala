

object findNextPrime2 {
  def findNextPrime(i: Int): Int = {
  if (i<=2)
    2
  else {
    var p: Int = i
    while (!((p==2) || (p>1) &&
              (p%2==1) &&
              ((3 to Math.round(Math.sqrt(p)).toInt by 2) forall (p % _ != 0))) ) {
      p = p + (if (p%2==0) 1 else 2)
    }
    p
  }
}
}