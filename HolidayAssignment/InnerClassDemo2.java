class Batsman
{
	static int totRuns;
	int totMatches;
	
	Batsman()
	{
	
	
	}
	
	Batsman(int totRuns, int totMatches)
	{
	   this.totRuns = totRuns;
	   this.totMatches = totMatches;
	
	}
	
	
			

	void printAverage()
	{
	  AvgCalculator avgcal = new AvgCalculator();
	  avgcal.myFun();
	  
	}
	
	static class AvgCalculator
	{
	  void myFun()
			{
			  System.out.println("My Fun Of AverageCalculator");
			  int res = totRuns + 100;
			  System.out.println("total runs is : "+res);
			
			
			}
	
	
	}
	
	
}

class InnerClassDemo2
{
	public static void main (String args [])
	{
		Batsman bats1 = new Batsman(1500,10);
		
		bats1.printAverage();
	
	
	
	
	}





}