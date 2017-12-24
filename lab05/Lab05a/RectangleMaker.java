import java.util.Scanner;

/**
 * this program takes necessary input from the user
 * and prints rectangular patterns according to them.
 * gives error if input is invalid.
 * reports if the printed pattern has no hole.
 * asks the user and prints more patterns if user wishes to do so.
 * @author omer musa battal
 * @version 17.11.2016
 */ 
public class RectangleMaker
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final char CH = '*';
      
      // variables
      String response;
      int width;
      int height;
      int thickness;
      boolean noHole;
      
      // program code
      // create rectangular patterns as many times as user wishes
      do
      {
         // initialize noHole and response
         noHole = true;
         response = "";
         
         // prompt user and get input
         System.out.print( "Enter width, height & thickness: ");
         width = scan.nextInt();
         height = scan.nextInt();
         thickness = scan.nextInt();
         
         // check if input is invalid
         // if so, give error and halt; else proceed
         if ( width <= 0 || height <= 0 || thickness <= 0 )
         {
            System.out.println( "Error: all values must be positive!");
         }
         else
         {
            // print lines with CH's
            for ( int i = 0; i < height; i++)
            {
               // print one line with CH's
               for ( int j = 0; j < width; j++)
               {
                  // check for places not to print CH
                  if ( ( i >= thickness && i < height - thickness ) && ( j >= thickness && j < width - thickness ) )
                  {
                     System.out.print( " ");
                     noHole = false; // update noHole
                  }
                  else
                  {
                     System.out.print( CH);
                  }
               }
               System.out.println();
            }
            System.out.println();
            
            // if there is no hole, report it
            if ( noHole )
            {
               System.out.println( "Oops... no hole!\n");
            }
            
            // prompt user for another pattern
            System.out.println( "Do you wish to create another pattern?\n(if so, respond with 'y' or 'Y', otherwise respond in any other way) ");
            response = scan.next();
            response = response.toLowerCase();
         }
         
      } while ( response.equals("y") );
      
      System.out.println( "goodbye");
   }
   
}
