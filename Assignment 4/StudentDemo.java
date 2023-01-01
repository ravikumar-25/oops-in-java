class Student
{
	String name;
	int subject1;
	int subject2;
	int subject3;
	double avg;
	
	void set(String n, int m1, int m2, int m3)
	{
	this.name=n;
	this.subject1=m1;
	this.subject2=m2;
	this.subject3=m3;
	}
    
	void totavg()
	{
	double avg=  (subject1+subject2+subject3)/3;
	this.avg = avg;
	}
	void display()
	{
	System.out.println("Student name= "+name);
	System.out.println("Student marks in first subject= "+subject1);
	System.out.println("Student marks in second subject= "+subject2);
	System.out.println("Student marks in third subject= "+subject3);
	System.out.println("Student average marks= "+avg);
	
	
	
	}
	
	
	

}

class StudentDemo
{
	public static void main (String args[])
	{
	  Student acc = new Student();
	  acc.set("Ravi",75,85,95);
	  acc.totavg();
	  acc.display();
	
	
	
	
	
	
	
	
	}





}