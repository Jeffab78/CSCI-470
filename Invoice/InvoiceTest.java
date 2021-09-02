/**********************************************************
 *                                                        *
 *  CSCI 470/502        Assignment 2         Summer 2020  *
 *                                                        *
 *  Developer(s):  Jeff Byerly - Z1860060                 *
 *                                                        *
 *  Section:  1                                           *
 *                                                        *
 *  Due Date/Time:  6/26/2020 11:59pm                     *
 *                                                        *
 *  Purpose:       Main App to test Invoice clas          *
 *                                                        *
 **********************************************************/
import java.text.DecimalFormat;

public class InvoiceTest
{
  
  public static void main(String[] args)
  {
    //creates Invoice objects for 5 different items ordered
    Invoice invoice1 = new Invoice("Hammer", "24-JKT", 2, 14.99);
    Invoice invoice2 = new Invoice("Screwdriver", "27-TBL", 2, 13.99);
    Invoice invoice3 = new Invoice("Hacksaw", "49-SAW", 5, 22.49);
    Invoice invoice4 = new Invoice("Face Mask", "4-COV", 3, 9.99);
    Invoice invoice5 = new Invoice("Flashlight", "14-DET", 1, 19.99);
    
    //creates a decimalformat class object in order to format the total invoice amount output.
    DecimalFormat invoiceFormat = new DecimalFormat("$##,###,###.00");
    
    //prints first Invoice
    System.out.printf("%-16s\n", "Invoice #1");
    System.out.printf("%-16s%10s\n", "Part No.: " , invoice1.getPartNum());
    System.out.printf("%-16s%10s\n", "Item Desc.: " , invoice1.getDesc());
    System.out.printf("%-16s%10s\n", "Quantity: " , invoice1.getQuantity());
    System.out.printf("%-16s%10s\n", "Item Price: " , invoice1.getPrice());
    System.out.printf("%-16s%10s\n", "Order Subtotal: " , invoiceFormat.format(invoice1.getInvoiceAmount()));
    System.out.println("_____________________________________\n\n");
    
    //prints the second invoice
    System.out.printf("%-16s\n", "Invoice #2");
    System.out.printf("%-16s%10s\n", "Part No.: " , invoice2.getPartNum());
    System.out.printf("%-16s%10s\n", "Item Desc.: " , invoice2.getDesc());
    System.out.printf("%-16s%10s\n", "Quantity: " , invoice2.getQuantity());
    System.out.printf("%-16s%10s\n", "Item Price: " , invoice2.getPrice());
    System.out.printf("%-16s%10s\n", "Order Subtotal: " , invoiceFormat.format(invoice2.getInvoiceAmount()));
    System.out.println("_____________________________________\n\n");
    
    //prints the third invoice
    System.out.printf("%-16s\n", "Invoice #3");
    System.out.printf("%-16s%10s\n", "Part No.: " , invoice3.getPartNum());
    System.out.printf("%-16s%10s\n", "Item Desc.: " , invoice3.getDesc());
    System.out.printf("%-16s%10s\n", "Quantity: " , invoice3.getQuantity());
    System.out.printf("%-16s%10s\n", "Item Price: " , invoice3.getPrice());
    System.out.printf("%-16s%10s\n", "Order Subtotal: " , invoiceFormat.format(invoice3.getInvoiceAmount()));
    System.out.println("_____________________________________\n\n");
    
    //prints the fourth invoice
    System.out.printf("%-16s\n", "Invoice #4");
    System.out.printf("%-16s%10s\n", "Part No.: " , invoice4.getPartNum());
    System.out.printf("%-16s%10s\n", "Item Desc.: " , invoice4.getDesc());
    System.out.printf("%-16s%10s\n", "Quantity: " , invoice4.getQuantity());
    System.out.printf("%-16s%10s\n", "Item Price: " , invoice4.getPrice());
    System.out.printf("%-16s%10s\n", "Order Subtotal: " , invoiceFormat.format(invoice4.getInvoiceAmount()));
    System.out.println("_____________________________________\n\n");
    
    //prints the fifth invoice
    System.out.printf("%-16s\n", "Invoice #5");
    System.out.printf("%-16s%10s\n", "Part No.: " , invoice5.getPartNum());
    System.out.printf("%-16s%10s\n", "Item Desc.: " , invoice5.getDesc());
    System.out.printf("%-16s%10s\n", "Quantity: " , invoice5.getQuantity());
    System.out.printf("%-16s%10s\n", "Item Price: " , invoice5.getPrice());
    System.out.printf("%-16s%10s\n", "Order Subtotal: " , invoiceFormat.format(invoice5.getInvoiceAmount()));
    System.out.println("_____________________________________");
  
  }
}