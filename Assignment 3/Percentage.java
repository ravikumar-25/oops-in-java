import java.util.*;
class Percentage{
public static void main(String args []){
	System.out.println("Enter no of subjects");
	 Scanner sc=new Scanner(System.in);
	 int no=sc.nextInt();
 System.out.println("enter marks");

 int marks[]=new int[no];
 for(int i=0;i<no;i++){
  marks[i] = sc.nextInt();
 }
 int sum=0;
 for(int j=0;j<no;j++){
 sum=sum+marks[j];
 }
 float Percentage=sum/no;
 System.out.println("Percentage is "+Percentage);
}
}