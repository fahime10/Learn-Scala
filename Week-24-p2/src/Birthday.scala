

class Birthday(private var name: String, private var day: Int, private var month: Int,
    private var year: Int) {
  
  def getName: String = name
  def getDay: Int = day
  def getMonth: Int = month
  def getYear : Int = year
  
  def getDOB: String = day + "/" + month + "/" + year
  
  def getFull: String = name + ", " + day + " " + month + " " + year
  
}