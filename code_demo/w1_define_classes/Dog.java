public class Dog {

  public Dog(int w) { weight = w; }

  public void makeNoise() {
    if (weight < 10) {
      System.out.println("yip!");
    } else if (weight < 30) {
      System.out.println("bark.");
    } else {
      System.out.println("wooooof!");
    }
  }

  public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weight > d2.weight) {
      return d1;
    }
    return d2;
  }

  public Dog maxDog(Dog d2) {
    if (this.weight > d2.weight) {
      return this;
    }
    return d2;
  }

  public int weight;

  // if you want to use a static variable, please use class name.
  public static String name = "Not a cat.";
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