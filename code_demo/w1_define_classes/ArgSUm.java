public class ArgSUm {
  public static void main(String[] args) {
    int sum = 0;
    int i = 0;
    int N = args.length;
    while (i < N) {
      sum += Integer.parseInt(args[i]);
      i += 1;
    }
    System.out.println(sum);
  }
}
