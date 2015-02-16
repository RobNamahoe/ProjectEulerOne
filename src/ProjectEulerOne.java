/**
 * Created by rckndn on 2/3/15.
 */
public class ProjectEulerOne {

  public static void main(String[] args) {
    int sum = getSum();
    System.out.println("sum: " + sum);
  }

  public static int getSum() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (isDivisibleByThreeOrFive(i)) {
        sum+=i;
      }
    }
    return sum;
  }

  public static boolean isDivisibleByThreeOrFive(int i) {
    return ((i % 3 == 0) || (i % 5 == 0));
  }

}
