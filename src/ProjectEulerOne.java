/**
 * Computes the sum of digits divisible by 3 or 5 up to a given upper bound.
 */
public class ProjectEulerOne {

  /**
   * Compute the sum of the first 1000 digits divisible by 3 and 5.
   * @param args Arguments - ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.println("sum: " + sum);
  }

  /**
   * Computes the sum of digits divisible by 3 or 5 up to upperBound.
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
