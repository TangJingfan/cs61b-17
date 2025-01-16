public class DogArray {
  public static void main(String[] argv) {
    Dog[] array = new Dog[2];
    array[0] = new Dog(20);
    array[1] = new Dog(150);
    array[0].makeNoise();

    Dog d1 = array[0];
    Dog d2 = array[1];
    Dog bigger = Dog.maxDog(d1, d2);
    bigger = d1.maxDog(d2);

    bigger.makeNoise();
  }
}
