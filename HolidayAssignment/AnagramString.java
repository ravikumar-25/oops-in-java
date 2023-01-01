import java.util.*; 
class AnagramString
{
	public static void main(String args [])
	{	
		
		//taking input of two strings to be compared from user 
		//ans storing it into two String data type variable 
		//Scanner sc = new Scanner (System.in);
		//System.out.println("Enter first string");
		//String str1 = sc.nextLine();
		//System.out.println("Enter second string");
		//String str2 = sc.nextLine();
		
		String str1 = "reverse";
		String str2 = "reserve";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// check length is same or not, if same then only 
		//can be a anagram
		if(str1.length() == str2.length())
		{
				
			//converting strings into character array with
			//"toCharArray()" method
			char [] charArray1 = str1.toCharArray();
			char [] charArray2 = str2.toCharArray();
		
			//converting two character arrays into two sorted arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//Arrays.equal() - checks if the sorted char arrays are 
			//equal or not
			boolean result = Arrays.equals(charArray1,charArray2);
			
			if(result)
			{
				System.out.println(str1+ " and " +str2+ " are Anagrams");
				
			}
			else
			{
				System.out.println(str1+ " and " +str2+ " are Not Anagrams");
			}	
			
		
		}
		
		else
		{
			System.out.println(str1+ " and " +str2+ " are Not Anagrams");
		}
			
		
		
	
		
	}
	
	
	
	
}

//"ANAGRAM NO " = Two strings are said to be anagram if we can form one string
                 // by arranging the characters of another string. For example, Race and Care. 
				 //Here, we can form Race by arranging the characters of Care.
//We first convert the strings to lowercase.
// It is because Java is case sensitive and R and r are 
//two difference characters in Java.
//The Arrays.sort() compares two characters with ASCII value.
// And, characters R and r are not equal. Hence, strings should 
//be converted to the same case.
//str1.toCharArray() - converts the string into a char array
//Arrays.sort() - sorts both the char arrays
//Arrays.equal() - checks if the sorted char array are equal



























 
