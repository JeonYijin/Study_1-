package com.ae.ae5;

public class CaptionTv extends Tv{

	boolean caption;  //caption 상태 on, off를 구분하는 변수

	
	void displayCaption(String text) {
	
		if(caption) {
			System.out.println(text);  //켜져있을 때만 
		}
	}
	
	
	
	
	
}
