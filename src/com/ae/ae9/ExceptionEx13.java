package com.ae.ae9;

public class ExceptionEx13 { //메서드에서 예외 처리하고 메인 실행

	public static void main(String[] args) {
		method1();
		
	}
	
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("method1에서 예외가 처리되었습니다.");
		}
	}
	

}
