package se.lexicon;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static void ex2() {
    int[] digits = {8, 3, 5, 9, 0, 4};
    System.out.println("Index position of 5 is:  " + indexOf(digits, 5));

  }


  public static int indexOf (int[]  digits, int x) {
    if (digits == null) return -1;
    int length = digits.length;
    int i = 0;

    while (i < length) {
      if (digits[i] == x) {
        return i;
      }
      else {
        i = i+1;
      }
    }
    return -1;

  }

  /*public static void ex2 ( String[] args ) {
    int checkIndex = Exercise02.indexOf(5);
    System.out.println("The index of 5 = " + checkIndex);
  }*/









}
