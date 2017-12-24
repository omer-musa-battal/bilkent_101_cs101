import java.util.Scanner;

/**
 * this program prompts user and gets input
 * produces a triangular shape
 * of base width (input from user) 
 * from a character (input from user)
 * @author omer musa battal
 * @version 03.11.2016
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      char ch;
      int width;
      int height;
      int count;
      
      // program code
      
      // promt the user and get ch and width values
      System.out.print( "please enter a character : ");
      ch = scan.next().charAt(0);
      System.out.print( "please enter a width(int): ");
      // check if user input is integer
      if ( !scan.hasNextInt() )
      {
         System.out.print( "invalid input.");
      }
      else
      {
         width = scan.nextInt();
         // print out a triangle formed using ch characters 
         // having a base of width characters
         height = 1;
         // print newline while height is less than input width
         while ( height <= width )
         {
            count = 0; // set count to zero before every loop
            // print ch while count is less than height
            while ( count < height )
            {
               System.out.print( ch);
               // update count
               count = count + 1;
            }
            System.out.println();
            // update height
            height = height + 1;
         }
         
      }
      
   }
   
}
