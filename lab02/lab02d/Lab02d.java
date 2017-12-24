import java.util.Scanner;

/**
 * This program gets lengths of sides of a garden from user,
 * calculates area of garden using Heron's Formula.
 * Prints the maximum amount of plants that can be planted
 * in that garden.
 * @author Omer Musa Battal
 * @version 20.10.2016
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final double PLANTS_PER_METER_SQUARED = 17;
      
      // variables
      double area;
      double a;
      double b;
      double c;
      double s;
      double numberOfFlowers;
      
      // program code
      
      // promt user and get a, b, c
      System.out.println( "Please enter lengths of the sides of your garden");
      System.out.print( "side 1: ");
      a = scan.nextDouble();
      System.out.print( "side 2: ");
      b = scan.nextDouble();
      System.out.print( "side 3: ");
      c = scan.nextDouble();
      
      // calculate area of triangle
      s = ( a + b + c ) / 2;
      area = Math.sqrt( s * ( s - a ) * ( s - b ) * ( s - c ));
      
      // find number of flowers that can be planted
      numberOfFlowers = area * PLANTS_PER_METER_SQUARED;
      
      // print result
      System.out.println( "A total of " + (int) numberOfFlowers +
                         " flowers can be planted at most.");
      
   }
   
}