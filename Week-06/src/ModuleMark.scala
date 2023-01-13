
import scala.io.StdIn.readInt

object ModuleMark {
  def main(args: Array[String]): Unit = {
    println("Type in the coursework percentage mark as an integer: ")
    var courMark = readInt()

    println("Type in the examination percentage mark as an integer: ")
    var examMark = readInt()
      
    var res = if (courMark >= 40 && examMark >= 40) {
      "The module was passed overall"
     } else {
      "The module was failed overall"
     }
    
    var res2 = if (courMark < 40 && examMark < 40) {
      "Resit coursework and examination"
    } else if (examMark < 40) {
      "Resit examination"
    } else if (courMark < 40) {
      "Resit coursework"
    } else {
      ""
    }
    
    println(res)
    println(res2 + " because you got less than 40%")
  }
}
  // this is the teacher's method

    /**print("Enter Course Work Mark : ")
    var courseworkMark = readInt()

    print("Enter Examination Mark : ")
    var examinationMark = readInt()

    var overallMark = (courseworkMark + examinationMark) / 2
    var finalResult = ""

    if (overallMark >= 40)
      finalResult = "Pass"
    else {
      finalResult = "Fail \n"
      if (courseworkMark < 40)
        finalResult += "Resit Coursework \n"
      if (examinationMark < 40)
        finalResult += "Resit Examination \n"
    }

    println("Final Result is  " + finalResult)*/