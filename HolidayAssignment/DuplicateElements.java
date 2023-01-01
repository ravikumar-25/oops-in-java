class DuplicateElements
{  
    public static void main(String[] args)
	
	{      
          
          
        int [] arr = new int [] {1, 2, 3, 4, 5, 7, 7, 8,8, 9, 6};   
          
        System.out.println("Duplicate elements in a given array is : ");  
	
        for(int i = 0; i < arr.length; i++) 
		{  
			
            for(int j = i + 1; j < arr.length; j++)
			{  
				
                if(arr[i] == arr[j]) 
				{	
                    System.out.println("Duplicate element = "+arr[i]); 
				  
                    break;
				}
			}
			
        }  
    }  
}  