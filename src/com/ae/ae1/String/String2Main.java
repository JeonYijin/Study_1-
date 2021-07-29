package com.ae.ae1.String;

public class String2Main {

	public static void main(String[] args) {
		
		String name = "Hello World";
		char ch = name.charAt(1);
		System.out.println(ch);
		
		name = "991021-1234567";
		ch = name.charAt(7);
		//남녀 판별
		
		if(ch=='1' || ch=='3') {
			System.out.println("남");
		}else {
			System.out.println("여");
		}
		
		
		
	}

}
