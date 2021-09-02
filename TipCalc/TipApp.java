/**********************************************************
 *                                                        *
 *  CSCI 470/502        Assignment 3         Summer 2020  *
 *                                                        *
 *  Developer(s):  Jeff Byerly - Z1860060                 *
 *                                                        *
 *  Section:  1                                           *
 *                                                        *
 *  Due Date/Time:  7/3/2020 11:59pm                      *
 *                                                        *
 *  Purpose:    Class encapsulates the user interface of  *
 *              the program                               *
 *                                                        *
 **********************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class TipApp
{
  TipCalculator tipCalc1 = new TipCalculator();
  
  public static void main(String[] args)
  {
    TipApp tipApp1 = new TipApp();
    
    tipApp1.calculateTips();
    
  }
  
  public void calculateTips()
  {
    //creates the scanner object for keyboard input
    Scanner scan = new Scanner(System.in);
    
    //create format object for bill output
    DecimalFormat tipFormat = new DecimalFormat("$##,###,###.00");
   
    //header
    System.out.println("---------Tip Calculator---------\n");
    
    char anotherBill;
    
    //Code for the bill input
    do
    {
      System.out.println("Enter the bill amount: ");
      //a loop to continue to prompt for a valid bill amount if an invalid one is entered
      double bill;
      
      do
      {
        //exception handling for if user enters a non numeric value or a negative bill amount
        try
        {
          Scanner scan1 = new Scanner(System.in);
          bill = scan1.nextDouble();
        }
        catch(InputMismatchException e)
        { 
          bill = -1;    
        }
        
        
      //gives message if bill is invalid
        if (bill < 0)
          System.out.println("Please enter a valid bill amount.");
      }
      while(bill <0);
    
      //sets the bill amount for the object 
      tipCalc1.setBillAmt(bill);
    
      //a loop to continue to prompt for a valid tip %  if an invalid one is entered
      int tip;
      System.out.println("Enter the tip percentage: ");
      do
      {
        //exception handling if non numeric value is entered
        try
        {
          Scanner scan2 = new Scanner(System.in);
          tip = scan2.nextInt();
        }
        catch(InputMismatchException e)
        { 
          tip = -1;    
        }
      
        if (tip < 0)
          System.out.println("Please enter a tip percentage.");
      }
      while(tip <0);
    
      //sets the tip percent for the object 
      tipCalc1.setTipPct(tip);  
    
      //a loop to continue to prompt for a valid party size if an invalid one is entered
      int party;
      System.out.println("Enter your party size: ");
      do
      {
              
        try
        {
          Scanner scan3 = new Scanner(System.in);
          party = scan3.nextInt();
        }
        
        catch(InputMismatchException e)
        { 
          party = -1;    
        }
    
        if (party < 1)
          System.out.println("Please enter a valid party size.");
      }
      while(party <1 );
    
      //sets the party size for the object  
      tipCalc1.setPartySize(party); 
    
      //Output formatted
      System.out.println("---------Your Summary---------\n");
    
      System.out.printf("%-16s%10s\n", "Bill Amount: " , tipFormat.format(tipCalc1.getBillAmt()));
      System.out.printf("%-16s%10s\n", "Tip %: " , tipCalc1.getTipPct());
      System.out.printf("%-16s%10s\n", "Party Size: " , tipCalc1.getPartySize());
    
      System.out.println("\n");
      System.out.printf("%-20s%10s\n", "Total Bill: " , tipFormat.format(tipCalc1.getTotalBill()));
      System.out.printf("%-20s%10s\n", "Individual Share: " , tipFormat.format(tipCalc1.getIndividualShare()));
      
      System.out.println("Would you like to enter another bill? (Y/N): ");
      anotherBill = scan.next().charAt(0);
    }
    while (anotherBill == 'y' || anotherBill == 'Y'); //if they ansered yes, return to do another bill
  }
}