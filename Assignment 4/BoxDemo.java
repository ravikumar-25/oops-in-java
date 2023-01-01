class Box
{
	int height;
	int width;
	int breath;
	double vol;
	double area;
	
	Box()
	{
	
	}
	Box(int h,int w,int b)
	{
	this.height=h;
	this.width=w;
	this.breath=b;
	}
	
	void getvolume()
	{
	double vol=(height*width*breath);
	this.vol=vol;
	
	}
	
	void getarea()
	{
	double area=((height*width)+(width*breath)+(breath*height));
	this.area=area;
	}
	
	void display()
	{
	System.out.println("Area of Room = "+area);
	System.out.println("Volume of Room= "+vol);

	}	
	
}

class BoxDemo
{
	public static void main(String args [])
	{
	Box a= new Box(2,4,6);
	a.getarea();
	a.getvolume();
	a.display();
	
	Box b= new Box(3,5,7);
	b.getarea();
	b.getvolume();
	b.display();
	
	
	
	
	
	}









}