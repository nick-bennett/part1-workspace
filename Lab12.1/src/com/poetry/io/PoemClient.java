/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.poetry.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class PoemClient {

  /**
   * To run one method at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
//    readPoem();
     writePoem();
  }

  /**
   * TASK: read all the lines in file 'famous-poem.txt' and print them.
   * <p>
   * Avoid the temptation to open the file in the IDE first. You'll see the poem once you get your
   * code working(!)
   * <p>
   * This file is in the module's root directory, which is the current / working directory at
   * runtime.  Therefore, the path to the file is just the filename.
   * <p>
   * Use a BufferedReader wrapped around a FileReader. The try-with-resources below allows you to
   * initialize the stream and auto-close it.
   */
  private static void readPoem() {
    // TODO: initialize 'reader' variable and complete the try block
    try (BufferedReader reader = new BufferedReader(new FileReader("famous-poem.txt"))) {
      for (String line = reader.readLine(); line != null; line = reader.readLine()) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * TASK: write a Haiku to file 'haiku.txt'.
   * <p>
   * A Haiku is a 3-line poem with the following characteristics: 1st line is 5 syllables 2nd line
   * is 7 syllables 3rd line is 5 syllables
   * <p>
   * Use a PrintWriter wrapped around a FileWriter. Use a try-with-resources to initialize the
   * stream and auto-close it.
   */
  private static void writePoem() {
    try (PrintWriter writer = new PrintWriter(new FileWriter("haiku.txt"))) {
      writer.println("I am debugging");
      writer.println("It's like playing whack-a-mole");
      writer.println("But I'm getting paid");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}