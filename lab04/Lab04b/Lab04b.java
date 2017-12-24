import java.util.Scanner;

/**
 * this program gets 100 integers 
 * from the user or a text file
 * then finds their sum, count, average,
 * minimum and maximum values.
 * @author omer musa battal
 * @version 03.11.2016
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int n;
      int sum;
      int count;
      int input;
      double average;
      int minimum;
      int maximum;
      
      // program code
      
      // read n integer values from user
      // add them to sum and count them
      n = 100;
      sum = 0;
      count = 0;
      minimum = Integer.MAX_VALUE;
      maximum = Integer.MIN_VALUE;
//      
//      System.out.println( "please input " + n + " integers: ");
//      while ( count < n )
//      {
//         input = scan.nextInt();
//         sum = sum + input;
//         count = count + 1;
//         // find minimum and maximum values
//         if ( input < minimum )
//         {
//            minimum = input;
//         }
//         if ( input > maximum )
//         {
//            maximum = input;
//         }
//      }
//      
      input = 0;
      while ( input >= 0 )
      {
         input = scan.nextInt();
         if ( input >= 0 )
         {
            sum = sum + input;
            count = count + 1;
            System.out.println( input);
            // find minimum and maximum values
            if ( input < minimum )
            {
               minimum = input;
            }
            
            if ( input > maximum )
            {
               maximum = input;
            }
         }
      }
      
      // report sum, count, minimum and maximum values
      System.out.println( "sum    : " + sum);
      System.out.println( "count  : " + count);
      System.out.println( "minimum: " + minimum);
      System.out.println( "maximum: " + maximum);
      
      // find average and report
      average = sum / count;
      System.out.println( "average: " + average);
      
   }
   
}