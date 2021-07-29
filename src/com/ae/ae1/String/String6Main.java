package com.ae.ae1.String;

public class String6Main {

	public static void main(String[] args) {
		
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] citys = weather.split("-");
		for(int i =0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		System.out.println("----------------");
		weather = "32 89 45 67";
		
		citys = weather.split(" ");
		
		for(int i =0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		System.out.println("----------------");
		String name = "Te st    ";
		
		name = name.trim();
		System.out.println(name);
		
		String[] ar = name.split(" ");
		name = ar[0] + ar[1];
		System.out.println(name);
		
//		name = name.trim();
//		name = name.replace(" ", ""); //문자 사이의 공백을 공백없음으로 교체하는 방법
		
		
	}

}
