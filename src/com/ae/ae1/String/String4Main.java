package com.ae.ae1.String;

public class String4Main {

	public static void main(String[] args) {
		
		String n = "ae";
		String n2 = "ae";
		String n3 = new String("ae");
		String n4 = new String("ae");
		
		System.out.println(n==n2);
		System.out.println(n3==n4);
		System.out.println(n2==n3);
		System.out.println("------------");
		System.out.println(n.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n2.equals(n3));
		
	}

}
