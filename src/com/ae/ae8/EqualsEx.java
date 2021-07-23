package com.ae.ae8;

public class EqualsEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(801108);
		Person p2 = new Person(801108);
		
		if(p1==p2) {
			System.out.println("p1과 p2 같음");
		}else {
			System.out.println("p1과 p2 다름");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2같음");
		}else {
			System.out.println("p1과 p2 다름");
		}
				
				
		
		
	}

}
