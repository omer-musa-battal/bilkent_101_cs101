import java.util.Scanner;

/**
 * This program gets two integers from user
 * and perfoms calculations on them.
 * @author Omer Musa Battal
 * @version 20.10.2016
 */ 
public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int INT1;
      final int INT2;
      
      // variables
      int sum;
      int difference;
      int product;
      int division;
      int remainder;
      int maximum;
      int minimum;
      
      // program code
      
      // promt user and get input
      System.out.println( "Please enter two integers");
      System.out.print( "Integer 1: ");
      INT1 = scan.nextInt();
      System.out.print( "Integer 2: ");
      INT2 = scan.nextInt();
      
      // calculate wanted results
      sum        = INT1 + INT2;
      difference = INT1 - INT2;
      product    = INT1 * INT2;
      division   = INT1 / INT2;
      remainder  = INT1 % INT2;
      maximum    = Math.max( INT1, INT2);
      minimum    = Math.min( INT1, INT2);
      
      // print results
      System.out.println( "");
      System.out.println( "__Results__");
      System.out.println( "");
      System.out.println( "sum        = " + sum       );
      System.out.println( "difference = " + difference);
      System.out.println( "product    = " + product   );
      System.out.println( "division   = " + division  );
      System.out.println( "remainder  = " + remainder );
      System.out.println( "maximum    = " + maximum   );
      System.out.println( "minimum    = " + minimum   );
      
   }
   
}