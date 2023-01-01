class First
{
	private int a;
	
	void setA(int a)
	{
		this.a = a;
	}
	
	int getA()
	{
	    return a;
	}
}

class Second extends First
{
	int b;
}

class Third extends Second
{
	int c;
	
	Third(int a, int b, int c)
	{
		setA(a);
		this.b = b;
		this.c = c;
	}
}

class Main
{
	public static void main(String args[])
	{
		Third tobj = new Third(5,10,15);
		System.out.println(tobj.getA());
		System.out.println(tobj.b);
		System.out.println(tobj.c);
		
		//System.out.println(c);
		
		
		
	}
}