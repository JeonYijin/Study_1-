package com.ae.ae9;

public class ExceptionEx12 { //에외만 냅다 던지기 아무도 처리 안해줌
	
	public static void main(String[] args)  throws Exception{
		
		method1();
	}

	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
	
	
	
}
