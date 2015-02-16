import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests of the ProjectEulerOne project.
 */
public class ProjectEulerOneTest {

  /**
   * Tests the computeSumOfMultiples method to ensure the correct sum is obtained.
   * @throws Exception If an error occurs.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Compute the sum for the first 10 digits", 23, ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("Compute the sum for the first 20 digits", 78, ProjectEulerOne.computeSumOfMultiples(20));
    assertEquals("Compute the sum for the first 1000 digits", 233168, ProjectEulerOne.computeSumOfMultiples(1000));
  }



}