package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String [][] countryCapital = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
    for (int i = 0; i < countryCapital.length; i++) {
      for (int j = 0; j < countryCapital[i].length; j++) {
        System.out.println(countryCapital[i][j] + "\t");

      }
      System.out.println();
    }

  }

}
