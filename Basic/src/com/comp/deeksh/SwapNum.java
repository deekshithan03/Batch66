package com.comp.deeksh;

import java.util.Scanner;

public class SwapNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y= sc.nextInt();
		int temp;
		temp = x;
		x= y;
		y= temp;
		System.out.println(x + " "+y);
		
		//without 3rd variable
		x= x+y;
		y=x-y;
		x=x-y;
		System.err.println(x + " "+y);
	}

}
