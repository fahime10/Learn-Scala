

object curry2 {
  def eq(c: Char)(d: Char) = c==d //returns a boolean
  def notEq(x:Char)(y:Char)= x!=y
  def lessThan(x:Char)(y:Char) = y<x
  
  def main(args: Array[String]): Unit = {
    var string = "aardvark".toList
    
    println("aardvark".toList filter (eq('a')))
    println(string filter (eq('r')))
    println(string map (eq('a')))
    println(string filter (_ != 'v') filter(eq('v')))
    println(string filter (notEq('a')))
    println(string filter (_ > 'm') filter (eq('a')))
    println(string filter (lessThan('n')))
  }
}