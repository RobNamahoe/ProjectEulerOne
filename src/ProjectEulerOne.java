/**
 * Compute the sum of number divisible by 3 and 5.
 */
public class ProjectEulerOne {

  /**
   * Compute the sum of multiples of 3 and 5 that are less than 1000.
   * @param args Arguments - ignored.
   */
  public static void main(String[] args) {
   int sum = 0;
    sum = computeSumOfMultiples(1000);
    System.out.println("sum: " + sum);
  }

  /**
   * Compute the sum of multiples of 3 and 5 that are less than upperBound.
   * @param upperBound The upper bound.
   * @return The sum.
   */
  public static int computeSumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 0; i < upperBound; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    return sum;
  }

}
