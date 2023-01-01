class First
{
	class InnerFirst
	{
	    public void print()
		{
		  System.out.println("Inside Inner Class");
		
		
		
		}
	
	
	
	
	}

}


class Second
{
	public static void main(String args[])
	{
	   First.InnerFirst a = new First().new InnerFirst();
	
		a.print();
	
	}



}