class Batsman
{
	int totRuns;
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
	  double res = avgcal.calAverage();
	  System.out.println("Batsman Average is : "+res);
	  
	}
	
	class AvgCalculator
	{
	   double avg;
	   
	   double calAverage()
	   {
	     avg = totRuns/totMatches;
		 return avg;
	   
	   }
	
	
	}
	
	
}

class InnerClassDemo
{
	public static void main (String args [])
	{
		Batsman bats1 = new Batsman(1500,10);
		
		bats1.printAverage();
	
	
	
	
	}





}