import java.util.*;
class MathOperation
{
	
    static int sum(int n1, int n2)
	{
	int sum=n1+n2;
	return sum;
	
	}
	
	static int subtraction(int n1, int n2)
	{
	int sub= n1-n2;
	return sub;
	
	}

	static int multiply(int n1, int n2)
	{
	int mul= n1*n2;
	return mul;
	
	}
	
	static int power(int n1, int n2)
	{
	int pow=(int) Math.pow(n1,n2);
	return pow;
	}



}

class Demo
{	
	public static void main (String args[])
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First number");
	int a= sc.nextInt();
	System.out.println("Enter Second number");
	int b= sc.nextInt();
	
	int c= MathOperation.sum(a,b);
	int d= MathOperation.subtraction(a,b);
	int e= MathOperation.multiply(a,b);
	int f= MathOperation.power(a,b);
	
	System.out.println("Two numbers are "+a+" and "+b);
	System.out.println("Sum of two numbers is "+c);
	System.out.println("Subtraction of two numbers is "+d);
	System.out.println("Multiplication of two numbers is "+e);
	System.out.println("Power of second no to first no is "+f);
	
	
	
	
	
	
	}













}