package com.capg.employeemanagement;

public class MyWrapperClass {
	public static void main(String[] args) {
		
		//wrapper class used to convert one data type to another
		int num = 10;
		Integer num2 = new Integer(num);
		
		Byte b =num2.byteValue();
		System.out.println(b);
		
		
		String str = "10";        
		Integer num3 = Integer.parseInt(str);  //used to convert string value to int value
		int num4 = num2 + num3;
		System.out.println(num4);
		
		double d =num2.doubleValue();
		String str1 = num2.toString();
		
		Float  f= new Float(d);
		
		f.byteValue();
		f.compareTo(f);
		f.doubleValue();
		f.intValue();
		f.longValue();
		f.shortValue();
		System.out.println(f.MAX_VALUE);
		System.out.println(f.MIN_VALUE);
		
		Double dd = new Double(f);
		
		dd.byteValue();
		dd.intValue();
		dd.compareTo(dd);
		dd.shortValue();
		dd.longValue();
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);

	}

}
