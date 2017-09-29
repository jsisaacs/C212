/* Joshua Isaacson 
 * 9/5/2017
 * C212
 */

import java.util.Scanner;

public class TimeCalc {
 
  static String userInputTime1;
  static String userInputTime2;
  static String stringHourOne;
  static String stringHourTwo;
  static int intHourOne;
  static int intHourTwo;
  static String stringMinuteOne;
  static String stringMinuteTwo;
  static int intMinuteOne;
  static int intMinuteTwo;
  static int totalMinutes1;
  static int totalMinutes2;
  static int diffMinus1440;
  static int remainder;
  static int fullHours;
  static int remainingMinutes;
  static String stringHour;
  static String stringMinute;
  
  //extracts hour and converts to int for time 1
  public static int stringToHourTime1(String time1) {
    //does these operations for both of the times   
    //isolates the hour from the string
    stringHourOne = time1.substring(0, 2);
 
    //creates integers from the stringHour
    intHourOne = Integer.parseInt(stringHourOne);
    
    return intHourOne;   
  }
  
  //this method is the exact same as stringToHourTime1 except it is for time 2
  public static int stringToHourTime2(String time2) {
    stringHourTwo = time2.substring(0, 2);
    
    intHourTwo = Integer.parseInt(stringHourTwo);
    
    return intHourTwo;
  }
  
  public static int stringToMinuteTime1(String time1) {
    //isolates the minutes from the string
    stringMinuteOne = time1.substring(3, 5);
    
    //creates integer from the stringMinute
    intMinuteOne = Integer.parseInt(stringMinuteOne);
    
    return intMinuteOne; 
  }
  
  //this method is the exact same as stringToMinuteTime2 except it is for time 2
  public static int stringToMinuteTime2(String time2) {
    stringMinuteTwo = time2.substring(3, 5);
    intMinuteTwo = Integer.parseInt(stringMinuteTwo);
    
    return intMinuteTwo;
  }
  
  //returns the total minute for the time entered
  public static int toMinutesTime1(int hour1, int minute1) {
    int totalMinutes1 = intHourOne * 60 + intMinuteOne;
    
    return totalMinutes1;
  }
  
  //same as the method above, but for time2
  public static int toMinutesTime2(int hour2, int minute2) {
    int totalMinutes2 = intHourTwo * 60 + intMinuteTwo;
    
    return totalMinutes2;
  }
  
  //takes the total minutes from the above two methods and calculates
  //the total hours as well as the remainder of minutes left over
  public static int convertToHours(int totalMin1, int totalMin2) {
    diffMinus1440 = totalMin2 - totalMin1 + 1440;
    remainder = diffMinus1440 % 1440;
    fullHours = remainder / 60;
    
    return fullHours;
  }
  
  //takes the remainder calcuated above and uses it to find the remaining
  //minutes
  public static int convertToMinutes(int remainder) {
    remainingMinutes = remainder % 60;
    
    return remainingMinutes;
  }
  
  //takes the integers in the above two methods (convertToHours, convertToMinutes)
  // and outputs it in String form for the user
  public static String formattedStringOutput(int hours, int minutes) {
    stringHour = Integer.toString(hours);
    stringMinute = Integer.toString(minutes);
    return stringHour + " hours and " + stringMinute + " minutes.";
  }
  
  public static void main(String[] args) {
    //NOTE FOR THE GRADER
    //if you want to test each method, just delete the // before each of 
    //the System.out.println statements below :)
    
    //the following few lines dictates how the user inputs the times into the interface
    Scanner input;
    input = new Scanner(System.in);
    
    System.out.println("Enter the first time: ");
    userInputTime1 = input.nextLine();
    
    System.out.println("Enter the second time: ");
    userInputTime2 = input.nextLine();
    
    //test for stringToHourTime1 method
    int stringToHourTest1 = stringToHourTime1(userInputTime1);
    //System.out.println("hour for time 1 : " + stringToHourTest1);
      
    //test for stringToHourTime 2 method
    int stringToHourTest2 = stringToHourTime2(userInputTime2);
    //System.out.println("hour for time 2 : " + stringToHourTest2);
    
    //test for stringMinuteTime1 method
    int stringToMinuteTest1 = stringToMinuteTime1(userInputTime1);
    //System.out.println("minute for time 1: " + stringToMinuteTest1);
    
    //test for stringMinuteTime2 method
    int stringToMinuteTest2 = stringToMinuteTime2(userInputTime2);
    //System.out.println("minute for time 2: " + stringToMinuteTest2);
    
    //test for toMinutesTime1 method
    int totalMinutesTime1 = toMinutesTime1(stringToHourTest1, stringToMinuteTest1);
    //System.out.println("total minutes for time 1: " + totalMinutesTime1);   
    
    //test for toMinutesTime2 method
    int totalMinutesTime2 = toMinutesTime2(stringToHourTest2, stringToMinuteTest2);
    //System.out.println("total minutes for time 2: " + totalMinutesTime2);
    
    //test for convertToHours method
    int convertToHoursTest = convertToHours(totalMinutesTime1, totalMinutesTime2);
    //System.out.println("hours between time1 and time2: " + convertToHoursTest);
    
    //test for convertToMinutes method
    int convertToMinutesTest = convertToMinutes(remainder);
    //System.out.println("minutes between time1 and time2: " + convertToMinutesTest);
    
    //test for formattedStringOutput method
    String formattedStringOutputTest = formattedStringOutput(convertToHoursTest, convertToMinutesTest);
    System.out.println(formattedStringOutputTest);
  }
}