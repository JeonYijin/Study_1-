package com.ae.ae1.String;

import java.util.Scanner;

public class String5Main {

	public static void main(String[] args) {
		
		String n = "Hello World";
		String n2 = n.replace('W', 'A');//문자열도 가능
		System.out.println(n2);
		
		String n3 = n.substring(3);
		System.out.println(n3);
		
		n3 = n.substring(n.indexOf('W'), 9);
		System.out.println(n3);
		System.out.println("-----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장할 파일명을 입력");
		//a.txt iu.jpg study.pdf test.iu.gif
		//입력받은 파일명이 이미지 파일인지 아닌지 구분
		//이미지 파일 형식 jpg, gif, png, svg
		
		String [] files = {"jpg","png","gif","svg"};
		String fileName = sc.next();
		int num = fileName.indexOf('.');
		String fn = fileName.substring(num+1);
		
		boolean check = false;
		for(int i=0; i<files.length; i++) {
			if(fn.equals(files[i])){
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("이미지파일");
		}else {
			System.out.println("이미지파일 아님");
		}
		
		
	}

}
