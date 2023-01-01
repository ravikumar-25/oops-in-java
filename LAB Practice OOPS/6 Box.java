class Box
{
	double height;
	double breadth;
	double width;
	double vol;
	double area;
	
	Box()
	{
		
	}
	
	Box(double height, double breadth, double width)
	{
		this.height=height;
		this.breadth=breadth;
		this.width=width;
	}
	
	double getVolume()
	{
		vol=height*breadth*width;
		return vol;
	}
	
	double getArea()
	{
		area = 2*((height*breadth)+(breadth*width)+(width*height));
		return area;
	}
}

class Main
{
	public static void main(String args[])
	{
		Box b1 = new Box(1.5,2.3,3);
		Box b2 = new Box(2.3,4.2,3.8);
		
		double v1 = b1.getVolume();
		double a1 = b1.getArea();
		
		double v2 = b2.getVolume();
		double a2 = b2.getArea();
		
		System.out.println("Volume of Box 1= "+v1);
		System.out.println("Surface Area of Box 1= "+a1);
		System.out.println();
		System.out.println("Volume of Box 2= "+v1);
		System.out.println("Surface Area of Box 2= "+a1);
		
	}
}



/*
Output :
Volume of Box 1= 10.35
Surface Area of Box 1= 29.7

Volume of Box 2= 10.35
Surface Area of Box 2= 29.7

*/