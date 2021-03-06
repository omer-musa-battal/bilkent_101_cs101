import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * This program gets info about employee from the employer
 * and uses them to create an HTML file, does some checks and
 * operations on user input while doing so.
 * @author omer musa battal
 * @version 27.10.2016
 */ 
public class Lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {

      Scanner scan = new Scanner( System.in);
      
      PrintStream originalStdOut = System.out;
      
      // constants
      // C_ means close
      final String HTML = "<html>";
      final String C_HTML = "</html>";
      final String HEAD = "<head>";
      final String C_HEAD = "</head>";
      final String TITLE = "<title>";
      final String C_TITLE = "</title>";
      final String BODY = "<body>";
      final String C_BODY = "</body>";
      final String HR = "<hr>";
      final String IMG = "<img src=\"";
      final String C_IMG = ".gif\" align=\"left\">";
      final String H1 = "<h1>";
      final String C_H1 = "</h1>";
      final String P = "<p>";
      final String C_P = "</p>";
      final String BR_CLEAR_ALL = "<br clear=\"all\">";
      final double TAX_RATE_POOR = 0.05;
      final double TAX_RATE_MIDCLASS = 0.15;
      final double TAX_RATE_RICH = 0.25;
      final double MAX_SALARY = 10000;
      
      // variables
      String title;
      String name;
      int age;
      double grossSalary;
      double netSalary;
      double taxRate;
      String comments;
      
      // program code
      
      // prompt user and get necessary data
      System.out.println( "Please input necessary data of the employee");

      System.out.print( "Name    : ");
      name     = scan.next();

      System.out.print( "Age     : ");
      age      = scan.nextInt();

      System.out.print( "Salary  : ");
      grossSalary   = scan.nextDouble();
      
      // check if user entered valid input for age and grossSalary
      if ( age < 1 )
      {
         System.out.println( "Age can only be positive");
      }
      else if ( grossSalary < 0 || grossSalary > MAX_SALARY )
      {
         System.out.println( "Salary must be between 0 and " + MAX_SALARY);
      }
      else
      {
         System.out.print( "Comments: ");
         scan.nextLine();
         comments = scan.nextLine();
         
         // decide the taxRate for given employee
         if ( grossSalary < 1000 )
         {
            taxRate = TAX_RATE_POOR;
         }
         else if ( grossSalary > 5000)
         {
            taxRate = TAX_RATE_RICH;
         }
         else
         {
            taxRate = TAX_RATE_MIDCLASS;
         }
         
         netSalary = ( grossSalary - 100 ) * (1 - taxRate);
         
         title = name + "'s Home Page";
         
         System.setOut( new PrintStream( "magic.htm" ) );         
         
         // print html code
         System.out.println( HTML);
         System.out.println( "");
         System.out.println( HEAD);
         System.out.println( TITLE + title + C_TITLE);
         System.out.println( C_HEAD);
         System.out.println( "");
         System.out.println( BODY);
         System.out.println( "");
         System.out.println( HR);
         if ( Files.exists( Paths.get( name + ".gif" ) ) )
            System.out.println( IMG + name + C_IMG);
         System.out.println( H1 + name + C_H1);
         System.out.println( P + "Age: " + age + C_P);
         System.out.println( P + "Net Salary (Tax rate): " + netSalary +
            " (" + taxRate + ")" + C_P);
         System.out.println( P + "Comments: " + comments + C_P);
         System.out.println( HR);
         System.out.println( "");
         System.out.println( C_BODY);
         System.out.println( "");
         System.out.println( C_HTML);
         
         // create html file
         System.out.close();
         System.setOut( originalStdOut);
         System.out.println( "Webpage created.");
      }
      
   }

}
