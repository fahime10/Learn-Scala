

object ModuleMarks {
  
  class DegreeClassification 
  case object Fail         extends DegreeClassification    //case object means that there is only one of them
  case object Third        extends DegreeClassification    //the "extends" binds with the function we choose, in this case it's DegreeClassification
  case object LowerSecond  extends DegreeClassification
  case object UpperSecond  extends DegreeClassification
  case object First        extends DegreeClassification
  
  def getClassification(grade: Int): DegreeClassification =
    if (grade < 0) throw new IllegalArgumentException
    else if (grade < 40)  Fail
    else if (grade < 50)  Third
    else if (grade < 60)  LowerSecond
    else if (grade < 70)  UpperSecond
    else if (grade < 101) First
    else throw new IllegalArgumentException
}