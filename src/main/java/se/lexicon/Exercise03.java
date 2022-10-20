package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
    String[] favoriteCities = {"Paris", "London", "New York", "Stockholm"};
    Arrays.sort(favoriteCities);
    for (String cities : favoriteCities) {
      System.out.println(cities);
    }


  }


}
