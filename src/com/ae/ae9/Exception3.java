package com.ae.ae9;

public class Exception3 {

	public static void main(String[] args) {
		//예외 발생시키기
		
		try {
			Exception e = new Exception("고의로 발생 시킨 예외");
			throw e;
			//throw new Exception("고의로 발생 시킨 예외")  -- 한줄로도 가능
		}catch(Exception e) {
			System.out.println("에러메세지 "+ e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("프로그램이 정상 종료됨");
		
		
		
		
	}

}
