package com.comp.deeksh;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int temp;
		boolean isPrime=true;
		for(int i =2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
	}

}
