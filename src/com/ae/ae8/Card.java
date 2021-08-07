package com.ae.ae8;

public class Card {
	
	String kind;
	int number;
	
	public Card() {
		this("SPADE",1); // 생성자 메서드 호출, 인자값 입력
		
	}
	
	Card(String kind, int number){ //생성자 메서드 오버로딩, 멤버 변수 호출
		this.kind = kind;
		this.number = number;
	}
	
	
	public String toString() { //toString 메서드 오버라이딩 
		return "kind: "+kind+ ", number: " + number;
	}
	
}
