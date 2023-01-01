class Pattern22
{
	public static void main(String args [])													
	{
		int num;
		for(int i=1;i<=7;i++)
		{	
			num=1;
			for(int j=6;j>=i;j--)
			{
				System.out.print(num);
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
			
			
		}
			
	
	
	}

}

//1111111
//1111122
//1111333
//1114444
//1155555
//1666666
//7777777










