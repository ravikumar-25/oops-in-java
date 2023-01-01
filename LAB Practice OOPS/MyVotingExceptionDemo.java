class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}

class MyVotingExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		
		int age = 17;
		
		try
		{
			if(age > 18)
				System.out.println("You are eligible for voting.");
			else
				throw new MyException("You are not eligible for voting.");
		}
		catch(MyException me)
		{
			System.out.println("Exception caught : "+me.getMessage());
		}
		
		System.out.println("Program successfully executed");
	}
}