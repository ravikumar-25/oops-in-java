class Array{
public static void main(String args []){
  int arr[]=new int[]{2,5,8,7,4,9,6};
  int max=arr[0];
  int min=arr[0];
  
 for(int i=1;i<=6;i++)
 {
  if (arr[i]<min)
  min=arr[i];
  
  if(arr[i]>max)
  max=arr[i];
 }
  System.out .println("minimum is "+min);
  System.out .println("maximum is "+max);
  
 
}


}