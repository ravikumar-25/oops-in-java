class Diamond1{
public static void main(String args []){
 for(int i=1;i<=5 ;i++){ 		// to decide upper half length of diamond and enter into 1st row
	 for(int j=5;j>=i;j--)		//  first quarter half of diamond - triangle fill with blank space (Notapart of diamond)
		 System.out.print(" ");
	 for(int j=1;j<=i;j++)		// to print diamond fill with '*' (Part of Diamond)
		System.out.print("*");
	for(int j=2;j<=i;j++)		// second quarter half of diamond-triangle filled with '*' (part of Diamond)
		System.out.print("*");
	// for(int j=5;j>=i;j--)	// 	to print diamond fill with 'blank' (Not a Part of Diamond)
		// System.out.print(" ");
       System.out.println();	
 }
	 
	
	 for(int i=2;i<=5;i++){		// to decide lower half length of diamond and enter into second from mid row
		 for(int j=1;j<=i;j++)	//third quarter half of diamond-triangle filled with '*' (part of Diamond)
			 System.out.print(" "); // 	to print diamond fill with 'blank' (Not a Part of Diamond)
		 for(int j=5;j>=i;j--)		// to print diamond fill with '*' (Part of Diamond)
			 System.out.print("*");
		 for(int j=5;j>i;j--)		//fourth quarter half of diamond-triangle filled with '*' (part of Diamond)
			 System.out.print("*"); // to print diamond fill with '*' (Part of Diamond)
		 // for(int j=1;j<=i;j++)
			 // System.out.print(" "); 
		 System.out.println();
	 }
	 
	 
	 
	 
	 
	 
 





}
}