import java.util.Scanner;

class MathOperation
{
	static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	static int subtract(int a, int b)
	{
		int difference = a-b;
		return difference;
	}
	
	static int multiply(int a, int b)
	{
		int product = a*b;
		return product;
	}
	
	static int power(int a, int b)
	{
		int pow = (int)Math.pow(a,b); 
		return pow;
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt(); 
		
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt(); 
		
		
		int c = MathOperation.add(a,b);
		int d = MathOperation.subtract(a,b);
		int e = MathOperation.multiply(a,b);
		int f = MathOperation.power(a,b);

		System.out.println("Sum = "+c);
		System.out.println("Difference = "+d);
		System.out.println("Multiply = "+e);
		System.out.println("a to the power b = "+f);
		
	}
}

/*
Output :
Enter 1st number :
5
Enter 2nd number :
3
Sum = 8
Difference = 2
Multiply = 15
a to the power b = 125

*/