package com.comp.deeksh;

public class Pattern 
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
   
    public static void main(String args[]) 
    { 
        int n = 5; 
        rightTriangle(n); 
    } 
}
/*public class Pattern {
	public static void main(String[] args) {
		int i,j;
		int rows=6;
		for(i=0;i<rows;i++) {
			System.out.print(" ");
		}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
		}
			System.out.println();
	}

}*/
