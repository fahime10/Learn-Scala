import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import Ackermann._

class testackermann {
  @Test def is5 {
    assertEquals("5", 5, ackermann(0,4))
  }
}