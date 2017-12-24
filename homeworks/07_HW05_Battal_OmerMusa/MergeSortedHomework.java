import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program tests two mergeSorted methods.
 * Creates two random sorted int arrays,
 * copies their content to arrayLists,
 * then applies mergeSorted method to both pairs.
 * repeats the process while the user enters "y" or "Y".
 * @author omer musa battal
 * @version 25.12.2016
 */
public class MergeSortedHomework
{
   final static String SEPARATOR = "##########";
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int[] a;
      int[] b;
      ArrayList<Integer> c;
      ArrayList<Integer> d;
      String userInput;
      
      // program code
      System.out.println( "Welcome to mergeSorted!\n");
      System.out.println( "This program creates two random arrays,");
      System.out.println( "copies their contents to array lists,");
      System.out.println( "then tests the mergeSorted methods.");
      System.out.println( "Random arrays can be empty or null.");
      // run tests as much as the user enters "y" or "Y"
      do
      {
      	System.out.println();
      	// generate two random sorted arrays
      	a = randomArrayGenerator();
      	b = randomArrayGenerator();
      	// copy array contents to array lists
      	c = listInitializer( a);
      	d = listInitializer( b);
      	// test arrays
      	testArrays( a, b);
      	// test array lists
      	testArrayLists( c, d);
      	// ask user if he wants to try again
      	System.out.print( "\nPress 'y' to try again: ");
      	userInput = scan.nextLine();
      } while ( userInput.toLowerCase().equals( "y") );
      
      System.out.println( "Goodbye.\n");
   }
   
   /**
    * Merges two sorted array lists, producing a new array list.
    * Assumes the input array lists are in non-descending order.
    * @param a first sorted array list
    * @param b second sorted array list
    * @return merged array list
    */
   public static ArrayList<Integer> mergeSorted( ArrayList<Integer> a, ArrayList<Integer> b )
   {
   	ArrayList<Integer> mergedArrayList;
   	mergedArrayList = new ArrayList<>();
   	
   	// check for null and empty conditions
   	if ( ( a == null || a.size() == 0 ) && ( b == null || b.size() == 0 ) )
   	{
   		return mergedArrayList;
   	}
   	else if ( a == null || a.size() == 0 )
   	{
   		return b;
   	}
   	else if ( b == null || b.size() == 0 )
   	{
   		return a;
   	}
   	
   	int indexOfA;
   	int indexOfB;
   	indexOfA = 0;
   	indexOfB = 0;
   	// merge two array lists in order
   	while ( mergedArrayList.size() < a.size() + b.size() )
   	{
   		if ( indexOfB >= b.size() || ( indexOfA < a.size() && a.get( indexOfA) <= b.get( indexOfB) ) )
   		{
   			mergedArrayList.add( a.get( indexOfA));
   			indexOfA = indexOfA + 1;
   		}
   		else
   		{
   			mergedArrayList.add( b.get( indexOfB));
   			indexOfB = indexOfB + 1;
   		}
   	}
   	
   	return mergedArrayList;
   }
   
   /**
    * Merges two sorted arrays, producing a new array.
    * Assumes the input arrays are in non-descending order.
    * @param a first sorted array
    * @param b second sorted array
    * @return merged array
    */
   public static int[] mergeSorted( int[] a, int[] b )
   {
   	// check for null and empty conditions
   	if ( ( a == null || a.length == 0 ) && ( b == null || b.length == 0 ) )
   	{
   		return new int[0];
   	}
   	else if ( a == null || a.length == 0 )
   	{
   		return b;
   	}
   	else if ( b == null || b.length == 0 )
   	{
   		return a;
   	}
   	
   	int[] mergedArray;
   	mergedArray = new int[ a.length + b.length ];
   	
   	int indexOfA;
   	int indexOfB;
   	int indexOfMerged;
   	indexOfA = 0;
   	indexOfB = 0;
   	indexOfMerged = 0;
   	
   	// merge two arrays in order
   	while ( indexOfMerged < mergedArray.length )
   	{
   		if ( indexOfB >= b.length || ( indexOfA < a.length && a[ indexOfA ] <= b[ indexOfB ] ) )
   		{
   			mergedArray[ indexOfMerged ] = a[ indexOfA ];
   			indexOfA = indexOfA + 1;
   		}
   		else
   		{
   			mergedArray[ indexOfMerged ] = b[ indexOfB ];
   			indexOfB = indexOfB + 1;
   		}
   		
   		indexOfMerged = indexOfMerged + 1;
   	}
   	
   	return mergedArray;
   }
   
   /**
    * Turns an int array into a string.
    * @param array int array to be converted to string
    * @return string representation of the int array
    */
   public static String toString( int[] array )
   {
   	String result;
   	result = "{";
   	// check for null condition
   	if ( array == null )
   	{
   		return "null";
   	}
   	// check for empty condition
   	if ( array.length == 0 )
   	{
   		return result + "}";
   	}
   	// add each element into the string
   	for ( int i = 0; i < array.length - 1; i++)
   	{
   		result = result + array[i] + ", ";
   	}
   	
   	return result + array[array.length - 1] + "}";
   }
   
   /**
    * Creates a random int array.
    * @param 
    * @return a random int array
    */
   public static int[] randomArrayGenerator()
   {
   	// randomly return a null
   	double nullProbability;
   	nullProbability = 0.1;
   	
   	if ( Math.random() < nullProbability )
      {
      	return null;
      }
   	
   	int[] randomArray;
   	int minElement;
   	int multiplier1;
   	int multiplier2;
   	
   	minElement = 0;
      multiplier1 = 10;
      multiplier2 = 5;
      
      randomArray = new int[ (int) ( Math.random() * multiplier1 ) ];
      
      for ( int i = 0; i < randomArray.length; i++)
      {
      	randomArray[i] = minElement + (int) ( Math.random() * multiplier2 );
      	minElement = randomArray[i];
      }
      
      return randomArray;
   }
   
   /**
    * Turns an int array into an array list.
    * @param array int array to be converted to arrayList
    * @return initialized array list
    */
   public static ArrayList<Integer> listInitializer( int[] array )
   {
   	// check for null condition
   	if ( array == null )
   	{
   		return null;
   	}
   	
   	ArrayList<Integer> result;
   	result = new ArrayList<>();
   	// add each element into the array list
   	for ( int element : array )
   	{
   		result.add( element);
   	}
   	
   	return result;
   }
   
   /**
    * tests mergeSorted method for arrayLists.
    * @param a first sorted array list
    * @param b second sorted array list
    */
   public static void testArrayLists( ArrayList<Integer> a, ArrayList<Integer> b )
   {
   	System.out.println( "Merging two sorted array lists...");
   	System.out.println( a + " + " + b);
      System.out.println( " = " + mergeSorted( a, b));
      System.out.println( SEPARATOR);
   }
   
   /**
    * tests mergeSorted method for arrays.
    * @param a first sorted array
    * @param b second sorted array
    */
   public static void testArrays( int[] a, int[] b )
   {
   	System.out.println( "Merging two sorted arrays...");
   	System.out.println( toString( a) + " + " + toString( b));
      System.out.println( " = " + toString( mergeSorted( a, b)));
      System.out.println( SEPARATOR);
   }
   
}
