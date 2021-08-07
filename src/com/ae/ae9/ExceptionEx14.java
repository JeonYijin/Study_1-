package com.ae.ae9;

public class ExceptionEx14 { //메서드에서 예외를 던지고 메인에서 잡기

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main에서 예외를 처리했습니다.");
		}
	}

	static void method1() throws Exception{
		throw new Exception();
	}
	
}
