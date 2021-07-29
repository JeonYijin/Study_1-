package com.ae.ae1.String;

public class String3Main {

	public static void main(String[] args) {
		
		String name = "Hello world";
		char ch = 'o';
		//'o' 문자가 몇개 있는지?
		
		boolean flag = true;
		int num =0;
		int count = 0;
		while(flag) {
			num = name.indexOf(ch, num);
			if(num>0) {
				num+=1;
				count+=1;
			}else {
				break;
			}
			
		} System.out.println(ch+" 는 "+ count+" 개");
		
		//for문으로 바꾸기
		
		for(int i=0; i<name.length(); i++) {
			num = name.indexOf(ch,num);
			if(num>0) {
				num+=1;
				count+=1;
			}else {
				System.out.println("종료");
				break;
			}
		}System.out.println(ch+" 는 "+ count+" 개");
		
		
		
		
		
	}

}
