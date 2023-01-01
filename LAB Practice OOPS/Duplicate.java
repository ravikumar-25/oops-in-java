import java.io.*;
import java.util.*;

public class Duplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
         String b=sc.next();
         String c=sc.next();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        Arrays.sort(c2);
        char c3[]=c.toCharArray();
        
        int count=0;
            System.out.println("List of duplicate characters in String '"+a+"'");
        for(int i=0;i<a.length();i++)
        {
            count=1;
           for(int j=i+1;j<a.length();j++)
        {
          if(c1[i]==c1[j])             
            count++;    
        }
            if(count>1)
            {   
                System.out.println(c1[i]+" : "+count);
             }
        }
            System.out.println("List of duplicate characters in String '"+b+"'");
    for(int i=0;i<b.length();i++)
        {
          count=1;
        
           for(int j=i+1;j<b.length();j++)
        {
          if(c2[i]==c2[j])             
            count++;    
        }
            if(count>1)
            {
               System.out.println(c2[i]+" : "+count);
             }
        }
            
            System.out.println("List of duplicate characters in String '"+c+"'");
    for(int i=0;i<c.length();i++)
        {
          count=1;
           for(int j=i+1;j<c.length();j++)
        {
          if(c3[i]==c3[j])             
            count++;    
        }
            if(count>1)
            {   
                System.out.println(c3[i]+" : "+count);
             }
        }
        
    }
}





//List of duplicate characters in String 'Programming' 
//r : 2 
//g : 2 
//m : 2 
//List of duplicate characters in String 'Combination' 
//i : 2 
//n : 2 
// : 2 
//List of duplicate characters in String 'Java' 
//a : 2  */ 