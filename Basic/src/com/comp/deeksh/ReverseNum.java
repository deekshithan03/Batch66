package com.comp.deeksh;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		int n,temp ,r,sum=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
