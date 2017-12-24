import java.util.Scanner;

/**
 * This program demonstrates some basic method usage in java.
 * @author omer musa battal
 * @version 24.11.2016
 */ 
public class Lab06
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String SEPARATOR = "##########";
      
      // variables
      double x; // input from user for sin calculation
      double taylorTerm; // one term of the Taylor series
      double taylorSum; // sum of Taylor series
      String binary1; // an input binary number from user
      String binary2; // anotner input binary number from user
      String text; // an input line of text from user
      String word; // a word in text
      char ch; // a char in text
      
      // program code
      // point 1
      // print the table of powers
      System.out.printf( "%3s%6s%6s%6s\n", "n", "n^2", "n^3", "n^4");
      
      for ( int n = -1; n <= 10; n++)
      {
         System.out.printf( "%3d%6.0f%6.0f%6.0f\n", n, power( n, 2), power( n, 3), power( n, 4));
      }
      System.out.println( SEPARATOR);
      
      // point 2
      // print the table of factorials
      System.out.printf( "%3s%20s\n", "n", "n!");
      
      for ( int n = 1; n <= 15; n++)
      {
         System.out.printf( "%3d%20d\n", n, factorial( n));
      }
      System.out.println( SEPARATOR);
      
      // point 3
      // get two binary numbers from user and compute their sum
      System.out.print( "Please enter two binary numbers: ");
      binary1 = scan.next();
      binary2 = scan.next();
      
      System.out.println( toBinary( toDecimal( binary1) + toDecimal( binary2)));
      System.out.println( SEPARATOR);
      
      // point 4
      // reverse the words of a given line of text from user
      System.out.print( "Please enter a line of text: ");
      scan.nextLine();
      text = scan.nextLine();
      text = text + " ";
      word = "";
      
      // for every character in given text, check for spaces
      for ( int i = 0; i < text.length(); i++)
      {
         ch = text.charAt( i);
         // if ch is not space, add it to current word
         // else print the reverse of current word and reset word
         if ( ch != ' ' )
         {
            word = word + ch;
         }
         else
         {
            System.out.print( reverse( word) + " ");
            word = "";
         }
      }
      System.out.println( "\n" + SEPARATOR);
      
      // point 5
      // print the table of sin calculations
      System.out.print( "Please enter x for sin(x): ");
      x = scan.nextDouble();
      taylorSum = 0;
      
      System.out.printf( "%3s%10s%20s%25s%20s%20s\n", "n", "(-1)^n", "x^(2n+1)", 
                        "(2n+1)!", "taylorTerm", "taylorSum");
      
      // print the necessary table
      for ( int n = 0; n <= 10; n++)
      {
         taylorTerm = ( power( -1, n) * power( x, 2 * n + 1 ) ) / factorial( 2 * n + 1);
         taylorSum = taylorSum + taylorTerm;
         System.out.printf( "%3d%10.1f%20.10f%25d%20.10f%20.10f\n", n, 
                           power( -1, n), power( x, 2 * n + 1), 
                           factorial( 2 * n + 1), taylorTerm, taylorSum);
      }
      
      System.out.println( "Math.sin( x): " + Math.sin( x));
      System.out.println( "taylorSum   : " + taylorSum);
      
   }
   /**
    * This method computes a number to an integer power.
    * @param x base number
    * @param y integer power
    * @return x to the power y
    */
   public static double power( double x, int y)
   {
      double result;
      result = 1;
      
      for ( int i = 0; i < y; i++)
      {
         result = result * x;
      }
      
      return result;
   }
   
   /**
    * This method computes the factorial of an integer.
    * @param n number to be factorialized
    * @return factorial of the number
    */
   public static long factorial( int n)
   {
      long result;
      result = 1;
      
      for ( int i = n; i > 0; i--)
      {
         result = result * i;
      }
      
      return result;
   }
   
   /**
    * This method reverses an input String.
    * @param s string to be reversed 
    * @return reversed string
    */
   public static String reverse( String s)
   {
      String result;
      result = "";
      
      for ( int i = s.length() - 1; i >= 0; i--)
      {
         result = result + s.charAt( i);
      }
      
      return result;
   }
   
   /**
    * This method converts the given base2 String
    * to its decimal equivalent as an int.
    * @param base2 a base 2 number as a String
    * @return decimal equilavent of given base 2 number as an int
    */
   public static int toDecimal( String base2)
   {
      int result;
      // int intBase2;
      char current;
      
      result = 0;
      
      for ( int i = 0; i < base2.length(); i++)
      {
         current = base2.charAt( base2.length() - i - 1);
         
         if ( current == '1' )
         {
            result = result + (int) power( 2, i);
         }
         else if ( current == '0' )
         {
         }
         else // if not binary, return zero
         {
            return 0;
         }
         
      }
      /*
       intBase2 = Integer.parseInt( base2);
       
       for ( int i = 0; i < base2.length(); i++)
       {
       current = intBase2 % 10;
       for ( int j = 0; j < i; j++)
       {
       current = current * 2;
       }
       
       result = result + current;
       intBase2 = intBase2 / 10;
       }
       */
      
      return result;
   }
   
   /**
    * This method converts a positive decimal int value 
    * into the corresponding binary String.
    * @param base10 a positive decimal int value
    * @return binary equilavent of given decimal number as a String
    */
   public static String toBinary( int base10)
   {
      String result;
      result = "";
      
      while ( base10 > 0 )
      {
         result = ( base10 % 2) + result;
         base10 = base10 / 2;
      }
      
      return result;
   }
   
}
