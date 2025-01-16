package homework.hw0.ex4;

public class WindowPosSum {

  public static void windowPosSum(int[] a, int n) {
    int[] copy = new int[a.length];
    for (int i = 0; i < a.length; i += 1) {
      copy[i] = a[i];
    }

    for (int j = 0; j < a.length; j += 1) {
      if (copy[j] <= 0) {
        continue;
      } else {
        int index = 1;
        while (j + index < a.length && index <= n) {
          a[j] += copy[j + index];
          index += 1;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
