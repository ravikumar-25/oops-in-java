import java.util.Scanner;
class Circle{

  static void area(int r)
 {
	 double pi=3.14,ar;
  ar=pi*r*r;
 System.out.println("Area of circle is "+ar);
 
 }
static void circumference(int r)
{
	double circum,pi=3.14;
  circum=2*pi*r;
  System.out.println("Circumference of circle is "+circum);
}

public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle");
int r=sc.nextInt();
area(r);
circumference(r);




}












}