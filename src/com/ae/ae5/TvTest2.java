package com.ae.ae5;

public class TvTest2 {

	public static void main(String[] args) {
		Tv [] tvArr = new Tv[3];
		
		//Tv 배열 객체 생성해서 각 요소 저장
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
		
	}

}
