package com.ae.ae3;

public class For46 {

	public static void main(String[] args) {
		
		//두개의 주사위를 던졌을 때 합이 6이 되는 모든 경우의 수를 출력
		
		for(int i =1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(i+"+"+j +"="+(i+j));
				}
			}
		}
		
		
	}

}
