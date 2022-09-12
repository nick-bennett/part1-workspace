package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv1 = new Television();

    tv1.setBrand("Sony");
    System.out.println(tv1.getBrand()); // Should print Sony.

    tv1.setBrand("LG");
    System.out.println(tv1.getBrand()); // Should print LG.

    tv1.setBrand("RCA"); // Should print error message.
    System.out.println(tv1.getBrand()); // Should print LG (unchanged).

    tv1.setBrand("Zenith"); // Should print error message.
    System.out.println(tv1.getBrand()); // Should print LG (unchanged).

    tv1.setVolume(Television.MIN_VOLUME);
    System.out.println(tv1.getVolume()); // Should print 0.

    tv1.setVolume(Television.MAX_VOLUME);
    System.out.println(tv1.getVolume()); // Should print 100.

    tv1.setVolume(Television.MIN_VOLUME - 1); // Should print error message
    System.out.println(tv1.getVolume()); // Should print 100 (unchanged).

    tv1.setVolume(Television.MAX_VOLUME + 1); // Should print error message
    System.out.println(tv1.getVolume()); // Should print 100 (unchanged).

  }

}
