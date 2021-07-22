package com.ae.ae3;

public class For43 {
	public static void main(String[] args) {
		//1+(1+2) +(1+2+3)...계산 10까지
		int sum = 0;
		int total =0;
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			total = total+sum;
					
		}
		
		System.out.println(total);
		
	}
}
