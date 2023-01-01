class Room
{
	double h;
	double w;
	double b;
	double vol;
	
	double volume()
	{
		vol=h*w*b;
		return vol;
	}
}

class RoomDemo
{
    public static void main(String args[])
    {
	Room obj = new Room();
	obj.h=10;
	obj.w=12;
	obj.b=15;
	
	System.out.println("Volume of Room= "+obj.volume());
}
}