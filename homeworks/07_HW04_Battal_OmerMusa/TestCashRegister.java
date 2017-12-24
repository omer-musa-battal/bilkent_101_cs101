import java.util.Scanner;

/**
 * This program tests the CashRegister class.
 * @author omer musa battal
 * @version 18.12.2016
 */ 
public class TestCashRegister
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String SEPARATOR = "##########";
      
      // variables
      CashRegister register1;
      CashRegister register2;
      
      // program code
      // create a CashRegister object
      register1 = new CashRegister();
      System.out.println( "register1 has been created.");
      // demonstrate it
      System.out.print( "All Items: ");
      register1.displayAll();
      register1.addItem(1.95);
      System.out.println( "Added item.");
      register1.addItem(0.95);
      System.out.println( "Added item.");
      register1.addItem(2.55);
      System.out.println( "Added item.");
      System.out.print( "All Items: ");
      register1.displayAll();
      System.out.print( "Number of items: ");
      System.out.println( register1.getCount());
      System.out.print( "Total price: ");
      System.out.printf( "%.2f\n", register1.getTotal());
      register1.clear();
      System.out.println( "Register cleared.");
      System.out.print( "All Items: ");
      register1.displayAll();
      System.out.print( "Total price: ");
      System.out.printf( "%.2f\n", register1.getTotal());
      System.out.println( SEPARATOR);
      // create another CashRegister object
      register2 = new CashRegister();
      System.out.println( "register2 has been created.");
      // demonstrate it
      System.out.print( "All Items: ");
      register2.displayAll();
      register2.addItem(7.25);
      System.out.println( "Added item.");
      register2.addItem(3.85);
      System.out.println( "Added item.");
      register2.addItem(12.35);
      System.out.println( "Added item.");
      register2.addItem(17.15);
      System.out.println( "Added item.");
      System.out.print( "All Items: ");
      register2.displayAll();
      System.out.print( "Number of items: ");
      System.out.println( register2.getCount());
      System.out.print( "Total price: ");
      System.out.printf( "%.2f\n", register2.getTotal());
      register2.clear();
      System.out.println( "Register cleared.");
      System.out.print( "All Items: ");
      register2.displayAll();
      System.out.print( "Total price: ");
      System.out.printf( "%.2f\n", register2.getTotal());
   }

}
