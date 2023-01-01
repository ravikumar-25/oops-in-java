class StringDemo
{
	public static void main(String args [])
	{
		String s1 = "welcome";
		String s2 = new String("welcome");
		String s3 = "welcome";
		String s4 = new String("welcome");
		
		System.out.println("s1 == s2 returns "+(s1 == s2)); //false
		System.out.println("s1 == s3 returns "+(s1 == s3)); //true
		System.out.println("s3 == s4 returns "+(s3 == s4)); //false
		
		System.out.println("s1.equals(s2) returns " + (s1. equals(s2))); //true
		System.out.println("s1.equals(s3) returns " + (s1. equals(s3))); //true
		System.out.println("s3.equals(s4) returns " + (s3. equals(s4))); //true
		
		
		
		
		
		
	
	
	
	}



}