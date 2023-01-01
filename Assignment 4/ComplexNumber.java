class ComplexNumber
{
		int real;
		int imag;
		
		ComplexNumber()
		{
		this.real=0;
		this.imag=0;
		}
		
		ComplexNumber(int real)
		{
		this.real=real;
		this.imag=0;
		}
		
		ComplexNumber(int real, int imag)
		{
		this.real=real;
		this.imag=imag;
		}
		
		void display()
		{
		   System.out.println(this.real+" + "+this.imag+" i");
		}
		
		ComplexNumber add(ComplexNumber r)
		{
		int a = this.real + r.real;
		int b = this.imag + r.imag;
		return new ComplexNumber (a,b);
		}
		
		ComplexNumber multiply(ComplexNumber m)
		{
		int a = this.real * m.real + this.imag * m.imag;
		int b = this.imag * m.real + this.real * m.imag;
		return new ComplexNumber (a,b);
		}
		
		
		
}
class MainComplex

{
	public static void main(String args[])
	{
	System.out.println("First complex Number");	
	ComplexNumber obj = new ComplexNumber(3,2);
	obj.display();
	
	System.out.println("Second Complex Number");
	ComplexNumber obj1 = new ComplexNumber(4,-2);
	obj1.display();
	
	System.out.println("Addition of two complex numbers");
	ComplexNumber c ;//= new ComplexNumber ();
	c = obj.add(obj1);
	c.display();
	
	System.out.println("Multiplication of two complex numbers");
	ComplexNumber d; //= new ComplexNumber (); 
	d = obj. multiply(obj1);
	d.display();
	
	
	
	}
}