import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the ProjectEulerOne class.
 */
public class ProjectEulerOneTest {

  /**
   * Ensure computeSumOfMultiples method returns correct results.
   * @throws Exception If and error occurs.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Compute sum of terms < 10", 23, ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("Compute sum of terms < 20", 78, ProjectEulerOne.computeSumOfMultiples(20));
  }
}