package com.comp.deeksh;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		/*int n,temp ,r,sum=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");*/
		
		//String
		 String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	}
	

}
