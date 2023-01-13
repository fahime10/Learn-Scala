import scala.io.StdIn

object TicTacToe {
  import Array._
  
  class Player
  case object O extends Player
  case object X extends Player
  
  // the option provides either none or some
  private var grid: Array[Array[Option[Player]]] = ofDim[Option[Player]](3,3)
  var player: Player = _
  var turn: Int = 1
  
  def optPlayerToChar(p: Option[Player]): Char = p match {
    case None => ' '
    case Some(O) => 'O'
    case Some(X) => 'X'
  }
  
  def reset() {
    player = X                               // 0,0|1,0|2,0
    turn = 1                                 // 1,0|1,1|1,2
    for (i <- 0 to 2; j <- 0 to 2)           // 2,0|2,1|2,2
      grid(i)(j) = None
  }
  
  def showGrid() {
    println()
    for (j <- 0 to 2) {
      print("  " + optPlayerToChar(grid(0)(j)))
      print(" | " + optPlayerToChar(grid(1)(j)))
      print(" | " + optPlayerToChar(grid(2)(j)))
      println()
      if (j<2) println(" --- --- --- ")
    }
    println()
  }
  
  def winner(p:Player): Boolean = {
    for (x <- 0 to 2) {
      var result1 = 0
      var result2 = 0
      
      for (y <- 0 to 2) {
        if (grid(x)(y) != None && grid(x)(y).get == p)
          result1 += 1
        
        if (grid(y)(x) == Some(p))
          result2 += 1
      }
      if (result1 == 3 || result2 ==3)
        return true
    }
    
    if (grid(0)(0) == Some(p) && grid(1)(1) == Some(p) && grid(2)(2) == Some(p)) {
      return true
    }
    
    if (grid(0)(2) == Some(p) && grid(1)(1) == Some(p) && grid(2)(0) == Some(p)) {
      return true
    }
    
    return false
  }
  
  def inputMove() {
    var x: Int = 0
    var y: Int = 0
    
    do {
      println("Enter x")
      x = StdIn.readInt() - 1
      println("Enter y")
      y = StdIn.readInt() - 1
    } while (x < 0 || x > 2 || y < 0 || y > 2 || grid(x)(y)!=None)
      grid(x)(y) = Some(player)
      if (player == X)
      player = O
    else 
      player = X
  }
  
  def main(args: Array[String]): Unit = {
    reset()
    while(turn < 9 && !winner(X) && !winner(O)) {
      println(s"It is ${optPlayerToChar(Some(player))}'s turn")
      showGrid()
      inputMove()
    }
    showGrid()
    if (winner(X))
      println(s"${optPlayerToChar(Some(X))} won")
    else if (winner(O))
      println(s"${optPlayerToChar(Some(O))} won")
    else
      println("It's a draw")
  }
}