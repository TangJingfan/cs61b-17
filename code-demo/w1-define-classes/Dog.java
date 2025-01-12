public class Dog {

  public void makeNoise() {
    if (weight < 10) {
      System.out.println("yip!");
    } else if (weight < 30) {
      System.out.println("bark.");
    } else {
      System.out.println("wooooof!");
    }
  }

  public int weight;
}

/*
 * This program won't run because this class lacks a main function.
 */

/*
 * Then we will add a main function back.
 */

/*
 * Like cpp, a class can contain data.
 */