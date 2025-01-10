public class DrawTriangle {
  public static void main(String[] args) {
    int layer = 5;
    int start = 1;
    while (start <= layer) {
      int num = 0;
      while (num < start) {
        System.out.print("*");
        num = num + 1;
      }
      System.out.println("");
      start = start + 1;
    }
  }
}
