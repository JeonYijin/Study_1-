package com.ae.ae1.String;

public class String7Main {

	public static void main(String[] args) {
		
		
		int num = 10; //--> "10"
		
		String str = String.valueOf(num);
		System.out.println(str);
		
		String a = "abc";
		String b = "def";
		a= a+b+"gif";

		String n1 = "abc, ";
		String n2 = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n1);
		sb.append(n2);
		sb.append(5);
		
		System.out.println(sb);
		
		str = sb.toString(); //sb는 string이 아님
		System.out.println(str);
	}

}
