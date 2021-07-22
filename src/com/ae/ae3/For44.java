package com.ae.ae3;

public class For44 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)...몇까지 더해야 100이상인지 구하시오
		
		int sum = 0;
		int s=1;
		int num=0;
		for(int i=1; true; i++,s=-s) {
			num = i*s;
			sum = sum+num;
			
			if(sum>=100) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
		
		
		boolean flag = true;
		while(flag) {
			int i=1;
			if(sum<100) {
				i++;
				s= -s;
				num = i*s;
			}else {
				System.out.println(num);
				flag = !flag;
			}
			
		}
		
		
		
	}

}
