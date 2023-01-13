import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import findNextPrime._

class TestfindNextPrime {
  
  @Test def testIsPrime1 {
    assertFalse("Negative numbers are not prime", isPrime(-5))
  }
  
  @Test def testIsPrime2 {
    assertFalse("0 is not a prime", isPrime(0))
  }
  
  @Test def testIsPrime3 {
    assertFalse("1 is not a prime number", isPrime(1))
  }
  
  @Test def testIsPrime4 {
    assertTrue("2 is the lowest prime number", isPrime(2))
  }
  
  @Test def testIsPrime5 {
    assertTrue("3 is prime", isPrime(3))
  }
  
  @Test def testIsPrime6 {
    assertFalse("4 is not prime", isPrime(4))
  }
  
  @Test def testIsPrime7 {
    assertEquals("7 is a prime", true, isPrime(7))
  }
  
  @Test def testisPrime8 {
    assertEquals("10 is not prime", false, isPrime(10))
  }
}