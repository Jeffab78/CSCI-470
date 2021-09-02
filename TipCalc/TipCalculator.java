/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 3        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:      TipCalculator                          *
 *                                                          *
 *  Programmer:  Jeff Byerly - Z1860060                     *
 *                                                          *
 *  Purpose:   Calculates a tip based of the bill inputed   *
 *                                                          *
 ************************************************************/

public class TipCalculator
{
  //private data members
  private double billAmt = 0;
  private int tipPct = 20;
  private int partySize = 1;
  
  //get and set methods for each data member
  public double getBillAmt()
  {
    return billAmt;
  }
  
  public void setBillAmt(double billAmt)
  {
    this.billAmt = billAmt;
  }
  
  public int getTipPct()
  {
    return tipPct;
  }
  
  public void setTipPct(int tipPct)
  {
    this.tipPct = tipPct;
  }
  
  public int getPartySize()
  {
    return partySize;
  }
  
  public void setPartySize(int partySize)
  {
    this.partySize = partySize;
  }
  
  /*
   Method: getTotalBill()
   Use: Gets the bill amount and adds the desired tip % to return final bill total
   */
  public double getTotalBill()
  {
    
    double total = billAmt + billAmt*(tipPct/100.0);
    
    return total;
  }
  
  /*
   Method: getIndividualShare()
   Use: Returns each individuals share of the bill based of the total and party size
   */
  public double getIndividualShare()
  {
    double share = this.getTotalBill() / partySize;
    return share;
  }
  
   
}