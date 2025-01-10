public class FindMax {
  public static int max(int[] m) {
    int length = m.length;
    int index = 0;
    int max = m[index];
    while (index != length) {
      if (m[index] > max) {
        max = m[index];
      }
      index = index + 1;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] numbers = new int[] {9, 2, 15, 2, 22, 10, 6};
    System.out.println(max(numbers));
  }
}
