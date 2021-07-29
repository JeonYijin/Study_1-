package com.ae.ae1.String;

public class String1Main {

	public static void main(String[] args) {
		
		String t1 = "Test";
		String t2 = new String("Test");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		//System.out.println(t1==t2);
		
		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString());
		System.out.println(t1==t2);
		
	}

}
