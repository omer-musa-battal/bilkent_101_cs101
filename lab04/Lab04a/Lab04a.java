import java.util.Scanner;

/**
 * this program gets an integer from user
 * checks if user input is valid
 * if the input is valid, does some spesific operations
 * @author omer musa battal
 * @version 03.11.2016
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String SEPERATOR = "----------";
      
      // variables
      int n;
      double k;
      int m;
      int step;
      
      // program code
      // prompt user and get input for n
      System.out.print( "please input a positive integer: ");
      
      // check if input is invalid, else proceed
      if ( !scan.hasNextInt() ) 
      {
         System.out.println( "Input must be an integer." );
      }
      else
      {
         n = scan.nextInt();
         if ( n < 0 )
         {
            System.out.println( "input must be positive.");
         }
         else
         {
            // output the even values from -n to n
            System.out.println();
            System.out.println( "the even values from -n to n \n");
            m = -n;
            while ( m <= n )
            {
               if ( m % 2 != 0 )
               {
                  System.out.print( m + " ");
               }
               // update m
               m = m + 1;
            }
            System.out.println();
            System.out.println( SEPERATOR);
            
            // output the squares of the even values 
            // from 0 up to n inclusive
            // separated by spaces, five numbers per line 
            System.out.println( "the squares of even values from 0 to n \n");
            m = 0;
            step = 0;
            while ( m < n )
            {
               if ( m % 2 == 0)
               {
                  System.out.print( ( m * m ) + " ");
                  step = step + 1;
                  // do seperation
                  if ( step % 5 == 0)
                  {
                     System.out.println();
                  }
               }
               // update m
               m = m + 1;
            }
            System.out.println();
            System.out.println( SEPERATOR);
            
            // output the values which are divisible by 3 or 4, 
            // but not both, from n down to 3
            // separated by spaces, five numbers per line
            System.out.println( "values which are divisible by 3 or 4, but not both, from n down to 3 \n");
            m = n;
            step = 0;
            while ( m >= 3 )
            {
               // check if m is divisible by 3 or 4, but not both
               if ( ( m % 3 == 0 ) ^ ( m % 4 == 0 ) )
               {
                  System.out.print( m + " ");
                  step = step + 1;
                  // do seperation
                  if ( step % 5 == 0)
                  {
                     System.out.println();
                  }
               }
               // update m
               m = m - 1;
            }
            System.out.println();
            System.out.println( SEPERATOR);
            
            // output 1 / k, which are greater than 0.01, 
            // for every integer k from n down to 1 
            // with two significant digits
            //  separated by spaces, five numbers per line
            System.out.println( "1 / k, which are greater than 0.01,\nfor every integer k from n down to 1 \n");
            m = 0;
            step = 0;
            k = n;
            while ( k >= 1 )
            {
               if ( (1 / k ) > 0.01 )
               {
                  System.out.printf( "%.2f ", ( 1 / k ));
                  step = step + 1;
                  // do seperation
                  if ( step % 5 == 0)
                  {
                     System.out.println();
                  }
               }
               k = k - 1;
            }
            System.out.println();
            System.out.println( SEPERATOR);
            
            // output all of the divisors of n
            System.out.println( "all of the divisors of n\n");
            m = 2;
            while ( m <= n )
            {
               // check if m is a divisor of n
               // if so, print it
               if ( n % m == 0 )
               {
                  System.out.print( m + " ");
               }
               // update m
               m = m + 1;
            }
            System.out.println();
         }
         
      }
      
   }
   
}
