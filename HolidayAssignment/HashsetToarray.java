import java.util.*;
public class HashsetToarray
{
	public static void main(String[] args)
	{
	  // Create a empty hash set
      HashSet<String> h_set = new HashSet<String>();
      // use add() method to add values in the hash set
          h_set.add("Ravi");
          h_set.add("Bhutal");
          h_set.add("Kalankar");
          h_set.add("Bhosale");
          h_set.add("Kamble");
          h_set.add("Bondre");
      System.out.println("Original Hash Set: " + h_set);
      // Creating an Array
      String[] new_array = new String[h_set.size()];
      h_set.toArray(new_array);
 
      // Displaying Array elements
      System.out.println("Array elements: ");
      for(String element : new_array)
	  {
        System.out.println(element);
      }
   }
}