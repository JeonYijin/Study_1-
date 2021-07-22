package com.ae.ae2;

public class OperatorEx9 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000; //이미 오버플로우가 발생하고 난 뒤에는 변환해도 소용없음
		long b = 1_000_000L * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
