import java.util.Scanner;

class First
{
	private int a;  //private data member
	
	void setA(int a){
		this.a = a; 
	}
	
	int getA(){ // return value of a for child classes
			return a;
	}
	
}

class Second extends First
{
	int b;
	
}

class Third extends Second {
	
	int c;

	
	
	Third(int a, int b, int c){
		setA(a); //call to setter to set a in class First
		this.b = b;
		this.c = c;
		
	}
	
	void print(){
		
		System.out.println(getA()); //calling getter for a
		System.out.println(b);
		System.out.println(c);
		
	}
}

class PrivateGetterSetter{
	
	public static void main(String args[]){
		       
		
	
		Third s = new Third(55,54,53);
		
		s.print();

	}

}








class A
{
	private int a;
	
	A()
	{
		System.out.println("A's 0-arg constructor is called");
	}
	
	A(int a)
	{
		System.out.println("A's 1-arg constructor is called");
		this.a = a;
	}
	
	void setDetails(int a)
	{
		this.a = a;
	}
	
	int getDetails()
	{
		return this.a;
	}
}

class B extends A{
	
	int b;
}

class C extends B{
	
	int c;


	C()
	{
	
	}

	C(int a, int b, int c)
	{
		//super(a);
		setDetails(a);
		//this.a = a;
		this.b = b;
		this.c = c;
	}


	void fun()
	{
		System.out.println(getDetails());
		System.out.println(b);
		System.out.println(c);
	}
}

class InitializePrivate{
	
	public static void main(String args[]){
		
		C cobj = new C(5,10,15);
		cobj.fun();
	}
}
