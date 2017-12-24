import java.util.Scanner;

/**
 * This program prompts the user, gets an input,
 * then proceeds with printing numbers from 0 to 50.
 * For every number, performs some operations if required.
 * Sums the numbers from 0 to user input,
 * compares result with the result of the sum formula.
 * Also prints the number of even and odd values.
 * @author omer musa battal
 * @version 27.10.2016
 */ 
public class Lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int even; 
      int odd;
      int sum;
      int n;
      
      // program code
      
      // prompt user and get input
      System.out.print( "Enter value for n: ");

      n = scan.nextInt();
      
      even = 0;
      odd = 0;
      sum = 0;
      
      // create a loop to count from 0 to 50,
      // perform required operations
      for ( int x = 0; x <= 50; x++ )
      {
         // check if x is out of range 12-25
         if ( x < 12 || x > 25 )
         {
            System.out.println( x + " out of range 12-25");
         }
         else
         {
            System.out.println( x + " ");
         }
         
         // check if x is even or odd and update total even or odd numbers
         if ( x % 2 == 0 )
         {
            even = even + 1;
         }
         else
         {
            odd = odd + 1;
         }
         
         // if x is a multiple of 5, print "Hi Five"
         if ( x % 5 == 0 )
         {
            System.out.println( "Hi Five");
         }
         // if x is a multiple of 2, print "Hi Two"
         else if ( x % 2 == 0 )
         {
            System.out.println( "Hi Two");
         }
         // if x is a multiple of 3 or 7, print "Hi ThreeOrSeven"
         else if ( x % 3 == 0 || x % 7 == 0 )
         {
            System.out.println( "Hi ThreeOrSeven");
         }
         // if x is a multiple of 3 or 7, print "Hi Others!"
         else
         {
            System.out.println( "Hi Others!");
         }
         
         // check if x is smaller or equal to n,
         // if so add x to sum
         if ( x <= n )
         {
            sum = sum + x;
         }
      }
      
      // check if sum is equal to formula
      if ( sum == n * ( n + 1 ) / 2 )
      {
         System.out.println( "Sum is equal to formula");
      }
      else
      {
         System.out.println( "Sum is not equal to formula");
      }
      
      // print the number of even and odd values
      System.out.println( "Number of even values is " + even);
      
      System.out.println( "Number of odd values is " + odd);
   }

}
