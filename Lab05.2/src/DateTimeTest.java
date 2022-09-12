/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.*;

class DateTimeTest {

  /**
   * main() calls each of the test methods in turn (currently commented out). To run one test method
   * at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    testNow();
    testCreate();
    testParse();
    testFormat();
  }

  /**
   * TASK: create current date, time, and date-time via now() and then print them.
   */
  public static void testNow() {
    System.out.println(LocalDate.now());
    LocalTime lt = LocalTime.now();
    System.out.println(lt);
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testCreate() {
    LocalDate birthday = LocalDate.of(1963, 12, 17);
    System.out.println(birthday);
    // NOTE: ignore time-zone, just assume Eastern Time is the local time.
    LocalDateTime lunarLanding = LocalDateTime.of(1969, 7, 20, 15, 18);
    System.out.println(lunarLanding);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testParse() {
    LocalDate birthday = LocalDate.parse("1963-12-17");
    System.out.println(birthday);
    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    birthday = LocalDate.parse("12/17/1963", formatter);
    System.out.println(birthday);
  }

  /**
   * TASK: create formatted display strings for the date below, in the specified formats.
   */
  public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);
    DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    System.out.println(usDateFormat.format(hastings));
    DateTimeFormatter intlFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println(intlFormat.format(hastings));
    // OPTIONAL: October 14, 1066
    DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    System.out.println(longFormat.format(hastings));
  }
}