package com.ae.ae1.wrapper;

public class Wrapper3Main {

	public static void main(String[] args) {
		
		String jumin="991224-1234567";
		//9   9   1   2   2   4 - 1  2  3  4  5  6 : 7은검증번호
	//  * 2   3   4   5   6   7   8  9  2  3  4  5
	//    18 + 27 + 4 +  10 + 12 + 28 + 8 + 18 + 6 +  12 + 20+ 30 =122(a)
		
		//2.   122를 11로 나누어서 나머지를 구해기
		//3.   11에서 나머지를 빼기(11-1 = 10) 검증번호랑 같으면 올바른 번호
		//3_1. 11에서 나머지를 뺏을 때 두자리 이상이라면
		//4.   3번에서 나온 결과를 다시 10으로 나누어서 그나머지를 구하기
		//     나머지 숫자랑 체크 번호랑 같으면 올바른 번호
		
		//1.charAt
//		char ch = jumin.charAt(0);
//		System.out.println(ch+"");// 공백을 더하면 int로 변환 가능 
//		//int num = Integer.parseInt(ch) -> 매개변수가 string타입 char타입 불가능
//		String s1 = String.valueOf(ch); //char타입을 string으로 바꾸기
//		int num = Integer.parseInt(s1);
//		System.out.println(num*2);
		jumin = jumin.replace("-", "");
		char ch = ' ';
		String s1 = "";
		int num =0;
		int total =0;
		for(int i=0, j=2; i<jumin.length()-1; i++, j++) {
			ch = jumin.charAt(i);
			s1 = String.valueOf(ch);
			num = Integer.parseInt(s1);
			total = total + (num * j);
			if(j>=9) {
				j=1;
			}
			System.out.println(total);
		}
		
		
		//3. split
		String [] strs = jumin.split("");
		int num2 =0;
		int num3 = 0;
		int sum = 0;
		for(int i=0, j=2; i<strs.length-1; i++, j++) {
			num2 = Integer.parseInt(strs[i]);
			num3 = num2*j;
			sum = sum +num3;
			
			if(j>=9) {
				j=1;
			}
		}System.out.println(sum);
		
		
		
		
		
	}

}
