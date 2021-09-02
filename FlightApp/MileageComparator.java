/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:      MileageComparator                      *
 *                                                          *
 *  Programmer:  Jeff Byerly - Z1860060                     *
 *                                                          *
 *  Purpose:   Compares two destination cities miles        *
 *                                                          *
 ************************************************************/
import java.util.Comparator;

public class MileageComparator implements Comparator<Destination>
{
  @Override
  public int compare(Destination d1, Destination d2)
  {
    return (d2.getMiles() - d1.getMiles());
  }
}