package com.ae.ae3;

public class For47 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			sum = sum+ str.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}

}
