
package cse360assignment02;

/**
 *
 * @author Luis Gonzalez
 * Edited class that adds and subtracts . Can also clear the results
 */
public class AddingMachine 
{
  private int total;
  private String aHistory ="0";
  
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () 
  {
    return total;
  }
  
  public void add (int value) 
  {
      total= total+value;
      aHistory= (aHistory + "+" + value);
  }

  public void subtract (int value ) 
  {
      total = total - value;
      aHistory= (aHistory+"-"+value);
  }

  public String toString () 
  {
    return aHistory;
  }

  public void clear() 
  {
      total=0;
      aHistory = "0";
  }
    
}
