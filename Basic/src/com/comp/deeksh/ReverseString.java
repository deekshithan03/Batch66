package com.comp.deeksh;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println(str2);

		// without using reverse()
		char chars[] = str.toCharArray(); // converted to character array and printed in reverse order
		for (int i = chars.length - 1; i >= 0; i--) {
			System.err.print(chars[i]);
		}
	}
}