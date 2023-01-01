import java.util.*; 
class AnagramString2
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
		
		
		if(str1.length() == str2.length())
		{
				
			
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