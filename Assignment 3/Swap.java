import java.util.*;
class Swap{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("first no is "+m+" second no is "+n);
m=m+n;
n=m-n;
m=m-n;
System.out.println("first no is "+m+" second no is "+n);




}
}