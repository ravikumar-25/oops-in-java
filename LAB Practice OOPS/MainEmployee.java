abstract class Employee
{
	private String name;
	private int id;
	private double basic;
	private double gross;
	
	void setDetails(int id, String name,double basic)
	{
	this.id=id;
	this.name=name;
	this.basic=basic;
	}
	
	void setGross(double gross)
	{
	this.gross=gross;
	}
	
	int getId()
	{
	return id;
	}
	
	String getName()
	{
	return name;
	}
	
	double getBasic()
	{
	return basic;
	}
	
	double getSalary()
	{
	return gross;
	}
	
	void printDetails()
	{
	System.out.println("Id= "+id+" Name= "+name+" Salary= "+gross);
	}
	
	}
	
class RegularEmp extends Employee
{
	int HRA=800;
	RegularEmp()
	{
	
	}
	RegularEmp(int id, String name,double basic)
	{
	setDetails(id,name,basic);
	double gross=(basic*1.70)+HRA;
	setGross(gross);
	}
	
	void printDetails()
	{
	System.out.println("Details of Regular Employee: \t Id= "+getId()+" Name= "+getName()+" Salary= "+getSalary());
	}
	
}

abstract class ContractBasedEmp extends Employee
{
	int tenure;
	ContractBasedEmp()
	{
	tenure =0;
	}
	abstract void tenure();	
	
}	
	
class CDACEmp extends ContractBasedEmp
{
	CDACEmp()
	{
	
	}
	
	void tenure()
	{
	
	}
	
	CDACEmp(int id,String name,double basic ,int tenure)
	{
	setDetails(id,name,basic);
	setGross(basic*2.50);
    this.tenure=tenure;	
	
	}
	void printDetails()
	{
	System.out.println("Details of CDAC Employee: \t Id= "+getId()+" Name= "+getName()+" Salary= "+getSalary()+" and Tenure is "+tenure+" Year(s).");
	}

}	

class ThirdPartyEmp extends ContractBasedEmp
{
	ThirdPartyEmp()
	{
	
	}
	void tenure()
	{
	
	}
	ThirdPartyEmp(String name, double basic ,int tenure)
	{
	setDetails(0,name,basic);
	setGross(basic*1.30);
	this.tenure=tenure;

	}
	void printDetails()
	{
	System.out.println("Details of Third Party Employee: \t Id= "+getId()+" Name= "+getName()+" Salary= "+getSalary()+" and Tenure is "+tenure+" Year(s).");
	}


}	

class MainEmployee
{
	public static void main (String args[])
	{
	RegularEmp obj1=new RegularEmp(1,"Ravi",100000);
	obj1.printDetails();
	
	CDACEmp obj2=new CDACEmp(2,"Sam",100000,2);
	obj2.printDetails();
	
	ThirdPartyEmp obj3=new ThirdPartyEmp("Chetan",100000,1);
	obj3.printDetails();
	
	
	
	
	
	
	}








}	
	
	
	
