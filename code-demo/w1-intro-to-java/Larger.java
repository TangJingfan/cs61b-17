public class Larger {
  /**
   * return the larger of x and y
   * @param x an int
   * @param y an int
   * @return the largerof x and y
   */
  public static int larger(int x, int y) {
    if (x > y) {
      return x;
    }
    return y;
  }

  public static void main(String[] args) { System.out.println(larger(-5, 10)); }
}

/*
 * 1. Function must be a part fo a class.
 * 2. A function which is a part of a class is called a `method`.
 * 3. All function in Java is method.
 *
 * 4. To define a function, we use `public static`; we will be introduced
 * alternate ways.
 * 5. Define a function in Java is like doing the same thing in cpp (type of
 * parameters and return type).
 * 6. Functions in Java only return one thing.
 */