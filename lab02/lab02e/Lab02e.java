import java.util.Scanner;

/**
 * This program gets info about employee from the employer
 * and uses them to create an HTML file.
 * @author Omer Musa Battal
 * @version 20.10.2016
 */
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
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
      final String H1 = "<h1>";
      final String C_H1 = "</h1>";
      final String P = "<p>";
      final String C_P = "</p>";
      final String BR_CLEAR_ALL = "<br clear=\"all\">";
      
      // variables
      String title;
      String name;
      int age;
      double salary;
      String comments;
      
      // program code
      
      // prompt user and get necessary data
      System.out.println( "Please input necessary data of the employee");
      System.out.print( "Name    : ");
      name     = scan.next();
      System.out.print( "Age     : ");
      age      = scan.nextInt();
      System.out.print( "Salary  : ");
      salary   = scan.nextDouble();
      System.out.print( "Comments: ");
      scan.nextLine();
      comments = scan.nextLine();
      
      title = name + "'s Home Page";
      
      // print html file
      System.out.println( HTML);
      System.out.println( "");
      System.out.println( HEAD);
      System.out.println( TITLE + title + C_TITLE);
      System.out.println( C_HEAD);
      System.out.println( "");
      System.out.println( BODY);
      System.out.println( "");
      System.out.println( HR);
      System.out.println( H1 + name + C_H1);
      System.out.println( P + "Age: " + age + C_P);
      System.out.println( P + "Salary: " + salary + C_P);
      System.out.println( P + "Comments: " + comments + C_P);
      System.out.println( HR);
      System.out.println( "");
      System.out.println( C_BODY);
      System.out.println( "");
      System.out.println( C_HTML);

   }
   
}