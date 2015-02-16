import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectEulerOneTest {

  private ProjectEulerOne myClass;

  /**
   * Tests that the correct sum of the first 1000 integers is calculated.
   * @throws Exception An Exception.
   */
  @Test
  public void testGetSum() throws Exception {
    assertEquals(233168, myClass.getSum());
  }

  /**
   * Tests that numbers divisible by 3 and 5 are correctly identified.
   * Also tests that numbers not divisible by 3 or 5 are identified correctly.
   * @throws Exception
   */
  @Test
  public void testIsDivisibleByThreeOrFive() throws Exception {

    for (int i = 3; i < 1000; i+=3) {
      assertEquals(true, myClass.isDivisibleByThreeOrFive(i));
    }

    for (int i = 5; i < 1000; i+=5) {
      assertEquals(true, myClass.isDivisibleByThreeOrFive(i));
    }

    for (int i = 0; i < 1000; i++) {
      if (! (i % 3 == 0 || i % 5 == 0) ) {
        assertEquals(false, myClass.isDivisibleByThreeOrFive(i));
      }
    }

  }
}