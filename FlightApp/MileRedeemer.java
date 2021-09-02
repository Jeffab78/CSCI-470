/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:      MileRedeemer                           *
 *                                                          *
 *  Programmer:  Jeff Byerly - Z1860060                     *
 *                                                          *
 *  Purpose:   methods for redeeming miles                  *
 *                                                          *
 ************************************************************/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.Comparator;


public class MileRedeemer implements Comparator<Destination>
{
  //comparator
  @Override
  public int compare(Destination d1, Destination d2) 
  {
    return (d2.getMiles() - d1.getMiles());
  }
  
  
  private Destination[] destinationArray;
  private int milesRemaining;
  
  
  public void readDestinations(Scanner fileScanner) throws IOException
  {
    ArrayList<Destination> destinationList = new ArrayList<Destination>();
    String inputData;
    
    //reads the file and adds them to an arrayList
    while (fileScanner.hasNextLine())
    {
      inputData = fileScanner.nextLine();
      Destination addDest = new Destination(inputData);
      destinationList.add(addDest);
    }
    
    //converts the ArrayList to a normal array
    destinationArray = (Destination[]) destinationList.toArray(new Destination[destinationList.size()]);
    
    
  }
    
  public String[] getCityNames()
  {
    String[] cityNames = new String[destinationArray.length];
    
    //int to advance through array for each dest
    int i = 0;
    
    for (Destination dest : destinationArray)
    {
      cityNames[i] = dest.getName();
      i++;
    }
    
    return cityNames;
      
  }
  
  public String[] redeemMiles(int miles, int month)
  {
    //creates a String array to return and ArrayList to add a unknown number of Strings
    String[] availableDests;
    ArrayList<String> availableDestsAL = new ArrayList<String>();
  
    //for each Destination object, check to see which can be redeemed for first class 
    for (Destination city : destinationArray)
    {
      if (miles >= (city.getMiles() + city.getUpgradeCost()) || (miles >= (city.getOffSsnMiles() + city.getUpgradeCost()) 
                                        && month >= city.getOffSsnStart() && month <= city.getOffSsnEnd()))
      {
        availableDestsAL.add("* A trip to " + city.getName() + " in First Class");
      }
      //if a first class ticket cant be redeemed, check if an economy ticket can be.
      else
      {
        if (miles > city.getMiles() || (miles >= city.getOffSsnMiles()  && month >= city.getOffSsnStart() && month <= city.getOffSsnEnd()))
        {
          availableDestsAL.add("* A trip to " + city.getName() + " in Economy Class");
        }
        
          
      }
    }
    //converts the ArrayList back to a String array and return it
    availableDests = availableDestsAL.toArray(new String[availableDestsAL.size()]);
    return availableDests;
  }
  
  public int getRemainingMiles()
  {
    return milesRemaining;
  }
  
 
}

  
  