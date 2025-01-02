import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 7", true, PrimeCheck.isPrime(7));
    assertEquals("Test 43", true, PrimeCheck.isPrime(43));
    assertEquals("Test 97", true, PrimeCheck.isPrime(97));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 4", false, PrimeCheck.isPrime(9));
    assertEquals("Test 42", false, PrimeCheck.isPrime(42));
    assertEquals("Test 96", false, PrimeCheck.isPrime(96));
  }
}
