class Student
{
	String name;
	int m1;
	int m2;
	int m3;
	double avg;
	
	void setData(String name, int m1, int m2, int m3)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void calAvg()
	{
		double avg=(m1+m2+m3)/3;
		this.avg=avg;
	}
	
	void display()
	{
		System.out.println("Name= "+name);
		System.out.println("Marks in 1st Subject= "+m1);
		System.out.println("Marks in 2nd Subject= "+m2);
		System.out.println("Marks in 3rd Subject= "+m3);
		System.out.println("Average of 3 subjects= "+avg);
		
	}
	
}

class Main
{
	public static void main(String args[])
	{
		Student s1=new Student();
		
		
		s1.setData("Rahul",65,68,97);
		s1.calAvg();
		s1.display();
		
	}
}

/*
Output :
Name= Rahul
Marks in 1st Subject= 65
Marks in 2nd Subject= 68
Marks in 3rd Subject= 97
Average of 3 subjects= 76.0
*/