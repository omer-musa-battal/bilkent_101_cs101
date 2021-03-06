import java.util.Scanner;

/**
 * this program gets input from the user
 * and prints some desired tables.
 * @author omer musa battal
 * @version 17.11.2016
 */ 
public class TableGenerator
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String SEPERATOR = "##########";
      final String CELL_HOLDER = "-";
      
      // variables
      int rowNumber;
      int columnNumber;
      int cellNumber;
      String tableCell;
      
      // program code
      // prompt user and get input
      System.out.print( "Enter the desired number of rows and columns: ");
      rowNumber = scan.nextInt();
      columnNumber = scan.nextInt();
      
      // ##########
      // for loop for assignment 5b-1
      System.out.println( "\nTable of 'row,col'\n");
      // print lines
      for ( int i = 1; i <= rowNumber; i++)
      {
         // print one line
         for ( int j = 1; j <= columnNumber; j++)
         {
            tableCell = i + "," + j;
            
            // add spaces to align table
            for ( int k = 6; k > tableCell.length(); k--)
            {
               System.out.print( " ");
            }
            
            System.out.print( tableCell);
         }
         System.out.println();
      }
      System.out.println( "\n" + SEPERATOR);
      
      // ##########
      // for loop for assignment 5b-2
      System.out.println( "\nTable of multiplication\n");
      // print lines
      for ( int i = 1; i <= rowNumber; i++)
      {
         // print one line
         for ( int j = 1; j <= columnNumber; j++)
         {
            tableCell = "" + ( i * j );
            
            // add spaces to align table
            for ( int k = 6; k > tableCell.length(); k--)
            {
               System.out.print( " ");
            }
            
            System.out.print( tableCell);
         }
         System.out.println();
      }
      System.out.println( "\n" + SEPERATOR);
      
      // ##########
      // for loop for assignment 5b-3
      System.out.println( "\nTable of cell numbers\n");
      cellNumber = 0;
      // print lines
      for ( int i = 1; i <= rowNumber; i++)
      {
         // print one line
         for ( int j = 1; j <= columnNumber; j++)
         {
            tableCell = "" + cellNumber;
            cellNumber = cellNumber + 1;
            
            // add spaces to align table
            for ( int k = 6; k > tableCell.length(); k--)
            {
               System.out.print( " ");
            }
            
            System.out.print( tableCell);
         }
         System.out.println();
      }
      System.out.println( "\n" + SEPERATOR);
      
      // ##########
      // for loop for assignment 5b-4
      System.out.println( "\nTable of 'rowNum,-,-,-,...\n");
      // print lines
      for ( int i = 1; i <= rowNumber; i++)
      {
         // print one line
         for ( int j = 1; j <= columnNumber; j++)
         {
            
            if ( j == 1 )
            {
               tableCell = "" + i;
            }
            else
            {
               tableCell = CELL_HOLDER;
            }
            
            if ( j != columnNumber )
            {
               tableCell = tableCell + ",";
            }
            
            // add spaces to align table
            for ( int k = 6; k > tableCell.length(); k--)
            {
               System.out.print( " ");
            }
            
            System.out.print( tableCell);
         }
         System.out.println();
      }
      System.out.println( "\n" + SEPERATOR);
   }
   
}
