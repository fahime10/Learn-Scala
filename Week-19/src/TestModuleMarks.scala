import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import ModuleMarks._

class TestModuleMarks {
  @Test def testFail {
    assertEquals("20 from {0..39}", Fail, getClassification(20))
  }
  
  @Test def testThird {
    assertEquals("45 from {40..49}" , Third, getClassification(45))
  }
  
  @Test (expected = classOf[IllegalArgumentException]) def testIllegalNegative {
    getClassification(-5)
  }
  
  @Test (expected = classOf[IllegalArgumentException]) def MinValue {
    getClassification(-100)
  }
  
  @Test def testLowerSecond {
    assertEquals("55 from {50..59}", LowerSecond, getClassification(55))
  }
  
  @Test def testUpperSecond {
    assertEquals("65 from {60..69}", UpperSecond, getClassification(65))
  }
  
  @Test def testFirst {
    assertEquals("75 from {70..100}", First, getClassification(75))
  }
  
  @Test (expected = classOf[IllegalArgumentException]) def MaxValue {
    getClassification(101)
  }
  
  @Test (expected = classOf[IllegalArgumentException]) def minusOne {
    getClassification(-1)
  }
  
  @Test def zero {
    assertEquals("0 from {0..39}", Fail, getClassification(0))
  }
  
  
}