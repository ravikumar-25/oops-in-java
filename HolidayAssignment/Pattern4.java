class Pattern4
{
	public static void main(String args[])
	{
		int num;
		int x=5;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=x;j++)
			{
			   System.out.print(" ");
			}
			
			num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			
			}
		
		x--;
		System.out.println();
		
		
		}
	
	
	
	
	
	
	}









}