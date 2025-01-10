public class DrawTriangle {
  public static void main(String[] args) { drawTriangle(10); }

  public static void drawTriangle(int N) {
    int layer = N;
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
