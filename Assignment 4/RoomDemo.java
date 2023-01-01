class Room
{
	int height;
	int width;
	int breath;
	
	Room()
	{
	
	}
	
	Room(int h, int w, int b)
	{
	this.height= h;
	this.width= w;
	this.breath= b;
	}
	
	int volume()
	{
	int vol = height *width*breath;
	return vol;
	}
	
	void display(int v)
	{
	System.out.println("Room Height= "+this.height+"  Width= "+this.width+"  Breath= "+this.breath);	
	System.out.println("Volume of room is : "+v);
	}
	
}


class RoomDemo
{
	public static void main(String args [])
	{
	Room a = new Room(3,4,5);

	int b= a.volume();
	a.display(b);
	
	
	
	
	
	
	
	}










}