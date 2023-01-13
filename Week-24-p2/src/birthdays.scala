

object birthdays {
  def main(args: Array[String]): Unit = {
    var birthdays = List[Birthday]()
    
    val b1: Birthday = new Birthday("Jack", 5, 11, 1948)
    val b2: Birthday = new Birthday("Stefano", 5, 5, 2001)
    val b3: Birthday = new Birthday("Anita", 10, 1, 1998)
    
    birthdays = List(b1,b2,b3)
    
    birthdays.foreach(x => println(x.getName + " " + x.getDay + "/" + x.getMonth + "/" + x.getYear))
    
    println()
    
    var birthdaysOnThe5th = birthdays.filter(x => x.getDay == 5).foreach(x => println(x.getName))
    
    println()
    
    var birthdayByName = birthdays.filter(x => x.getName == "Stefano").foreach(x => println(x.getDOB))
  }
}