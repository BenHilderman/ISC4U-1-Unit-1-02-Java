import java.util.Scanner;

/**
 * This Log Company program shows user how many logs can fit in a truck
 * based on the length of each log.
 *
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-13 
 */

public class LogCompany {
  //variables
  double number;
  String firstline;
  
  /**
   * Inputs and calculates length of logs.
   */
  public static void main(String[] args) {
    //First text line says "Enter the needed length of logs in meters"
    firstline = "Enter the needed length of logs in meters";
    System.out.println(firstline);

    Scanner input = new Scanner(System.in);
    //Ask user for length of log
    System.out.print("Valid choices are 0.25, 0.5, 1: ");
    number = input.nextDouble();

    //Calculates how many logs can fit 
    double max = 1100 / (20 * number);
  
    // Shows how many logs the tuck can carry
    System.out.println("The truck can carry " + max + " logs");
  }
}