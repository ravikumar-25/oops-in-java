import java.util.*;
class NonRepeatedString
{
	public static void main (String args [])
	{	
		//Scanner sc = new Scanner (System.in);
		//String str = sc.nextLine();
		String str = "foreverfo";
		System.out.println("the string is "+str);
		
		for(int i=0; i<str.length(); i++)
		{
		  boolean flag = true;
		  
		  //for(int j=0;j<str.length();j++){
			//if(i!=j && str.charAt(i)== str.charAt(j))
		  for(int j=i+1;j<str.length();j++)
		  {
			if(str.charAt(i)==str.charAt(j))
			{
			   flag = false;
			   break;
			}
		  
		  
		  }
		 if(flag)
		 {
			System.out.println("the first non repeated character in string is "+str.charAt(i) );
			break;
		 
		 }
		
		}
		
		
		
	
	
	}
	



}