package se.lexicon;

import java.util.Arrays;

public class Exercise04 {
  public static void main(String[] args) {
    ex4();
  }


  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int [] firstArray = {1, 15, 20};
    int [] secondArray = Arrays.copyOf(firstArray, 3);
    System.out.println("Elements from first array: ");
    for (int arrays : firstArray) {
       System.out.print(arrays + "\t");
    }
    System.out.println("\n" + "Elements from second array: ");
    for (int arrays : secondArray) {
      System.out.print(arrays + "\t");

    }


  }

}
