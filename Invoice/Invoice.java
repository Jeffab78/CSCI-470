/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 2        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:      Invoice                                *
 *                                                          *
 *  Programmer:  Jeff Byerly - Z1860060                     *
 *                                                          *
 *  Purpose:   Represents an invoice for an item sold       *
 *                                                          *
 ************************************************************/

public class Invoice
{
  
  private String desc;    //stores item description
  private String partNum; //stores part number
  private int quantity;   //quantity of item being purchased
  private double price;   //price of the item
  
  //Get and set methods for description
  public void setDesc(String desc)
  {
    this.desc = desc;
  }
  
  public String getDesc()
  {
    return desc;
  }
  
  //get and get methods for part number
  public void setPartNum(String partNum)
  {
    this.partNum = partNum;
  }
  
  public String getPartNum()
  {
    return partNum;
  }
  
  //get and set methods for quantity
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  //get and set methods for price
  public void setPrice(double price)
  {
    this.price = price;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  //default constructor
  public Invoice()
  {}
  
  //constructor with arguments
  public Invoice(String desc, String partNum, int quantity, double price)
  {
    this.desc = desc;
    this.partNum = partNum;
    this.quantity = quantity;
    this.price = price;
  }
  
  //finds the amount for the invoice by multiplying price and quantity ordered
  public double getInvoiceAmount()
  {
    double total;
    
    //if values are negative, set them to 0
    if (this.quantity <0)
    {
      this.quantity = 0;
    }
    
    if (this.price < 0)
    {
      this.price = 0.0;
    }
    
    
    total = this.quantity * this.price;
    
    return total;
  }
  
  
  
}