/**********************************************************
 *                                                        *
 *  CSCI 470/502        Assignment 4         Summer 2020  *
 *                                                        *
 *  Developer(s):  Jeff Byerly - Z1860060                 *
 *                                                        *
 *  Section:  1                                           *
 *                                                        *
 *  Due Date/Time:  7/12/2020 11:59pm                     *
 *                                                        *
 *  Purpose:    Class has the main method and drives      *
 *              the program.                              *
 *                                                        *
 **********************************************************/
import java.util.Scanner;
import java.io.*;
import java.util.Comparator;

public class MileRedemptionApp
{
  public static void main(String[] args) throws IOException
  {
    //variables for reading the file in
    Scanner fileScan = new Scanner(System.in);
    String fileName;
    
    //prompts for the name of file
    System.out.println("Enter the name of the text file:");
    
    //creates a new File object from the read input
    fileName = fileScan.next();
    File file = new File(fileName);
    
    Scanner scan = new Scanner(file);
    
    //creates a MileRedeemer object from the read input file
    MileRedeemer client1 = new MileRedeemer();
    client1.readDestinations(scan);
    
    //creates an array of available destination strings from city names
    String[] availableDest;
    availableDest = client1.getCityNames();
    
    
    //prints the city names from the text file
    for (String names : availableDest)
    {
      System.out.println(names);
    }
    
    boolean cont = false;
    char another;
    String[] availDests;
    do
    {
      //prompts for  the clients flyers miles
      System.out.println("Enter the customers Frequent Flyer Miles: ");
      int flyerMiles;
      Scanner scan2 = new Scanner(System.in);
      flyerMiles = scan2.nextInt();
    
      //prompts for the clients travel month
      System.out.println("Enter the month of departure: (1-12)");
      int travelMonth;
      travelMonth = scan2.nextInt();
    
      //uses the 2 inputs to see what they can redeem
      availDests = client1.redeemMiles(flyerMiles, travelMonth);
      
      //checks the possible outcomes and outputs results
      if (availDests.length == 0)
      {
        System.out.println("***Your client has not accumulated enough Frequest Flyer Miles***");
      }
      else
      {
        System.out.println("Your client's Frquest Flyer Miles can be used to redeem the following tickets: ");
        for (String printDests : availDests)
        {
          System.out.println(printDests);
        }
        System.out.println("Your client's remaining Frequest Flyer Miles: " + client1.getRemainingMiles());
        
      }
      
      
      
      //asks if you want to process another
      System.out.println("Would you like to process another? (y/n)?");
      another = scan2.next().charAt(0);
      if (another == 'Y' || another == 'y')
      {
        cont = true;
      }
    }
    while (cont == true);
   
    
    
    
    
    
  }
}