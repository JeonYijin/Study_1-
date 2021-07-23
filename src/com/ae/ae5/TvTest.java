package com.ae.ae5;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println("tv1의 channel은 " + tv1.channel);
		System.out.println("tv2의 channel은 " + tv2.channel);
		
		tv2 = tv1;
		
		tv1.channel = 7;
		System.out.println("tv2의 channel을 7로 변경했습니다." );
		
		System.out.println("tv1의 channel은 " + tv1.channel);
		System.out.println("tv2의 channel은 " + tv2.channel);
		
	}

}
