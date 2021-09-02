/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:      Destination                            *
 *                                                          *
 *  Programmer:  Jeff Byerly - Z1860060                     *
 *                                                          *
 *  Purpose:   Contains information on destination cities   *
 *                                                          *
 ************************************************************/
import java.lang.*;

public class Destination
{
  //private data members
  private String name;
  private int miles;
  private int offSsnMiles;
  private int upgradeCost;
  private int offSsnStart;
  private int offSsnEnd;
  
  //default constructor
  public Destination()
  {
    name = "";
    miles = 0;
    offSsnMiles = 0;
    upgradeCost = 0;
    offSsnStart = 0;
    offSsnEnd = 0;
  }
  
  //constructor with input
  public Destination(String input)
  {
    String[] parts = input.split(";");
    String[] lastParts = parts[parts.length-1].split("-");
    
    name = parts[0];
    miles = Integer.parseInt(parts[1]);
    offSsnMiles = Integer.parseInt(parts[2]);
    upgradeCost = Integer.parseInt(parts[3]);
    offSsnStart = Integer.parseInt(lastParts[0]);
    offSsnEnd = Integer.parseInt(lastParts[1]);
  }
    
    
  
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  
  public void setMiles(int miles)
  {
    this.miles = miles;
  }
  public int getMiles()
  {
    return miles;
  }
  
  public void setOffSsnMiles(int miles)
  {
    this.offSsnMiles = miles;
  }
  public int getOffSsnMiles()
  {
    return offSsnMiles;
  }
  
  public void setUpgradeCost(int cost)
  {
    this.upgradeCost = cost;
  }
  public int getUpgradeCost()
  {
    return upgradeCost;
  }
  
  public void setOffSsnStart(int month)
  {
    this.offSsnStart = month;
  }
  public int getOffSsnStart()
  {
    return offSsnStart;
  }
  
  public void setOffSsnEnd(int month)
  {
    this.offSsnEnd = month;
  }
  public int getOffSsnEnd()
  {
    return offSsnEnd;
  }
  
  
}