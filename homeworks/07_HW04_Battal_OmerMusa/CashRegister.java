import java.util.ArrayList;

/**
 * A simulated cash register that tracks the item count and 
 * the total amount due.
 * taken from the class slides and implemented properly.
 */
public class CashRegister
{
   // properties
   private ArrayList<Double> priceList;
   
   // constructors
   /**
    * Constructs a cash register with cleared purchase list.
    */
   public CashRegister()
   {
      priceList = new ArrayList<>();
   }
   
   // methods
   /**
    * Adds an item to this cash register.
    * @param price the price of this item
    */
   public void addItem(double price)
   {
      priceList.add( price);
   }

   /**
    * Gets the price of all items in the current sale.
    * @return the total amount
    */
   public double getTotal()
   {
      double total;
      total = 0;
      
      for ( int i = 0; i < priceList.size(); i++)
      {
      	total = total + priceList.get( i);
      }
      
      return total;
   }

   /**
    * Gets the number of items in the current sale.
    * @return the item count
    */
   public int getCount()
   {   
      return priceList.size();
   }
   
   /**
    * Clears the item count and the total.
    */
   public void clear()
   {
      priceList.clear();
   }
   
   /**
    * Displays the prices of all items the current sale.
    */
   public void displayAll()
   {
      System.out.println( priceList);
   }
   
}
