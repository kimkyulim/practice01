package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		int num =0;
	
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("숫자를 입력하세요 :");
		num = sc.nextInt();//숫자입력 
		
		 //프로그램을 구현하세요.
		while(true) {
		        for (int i = num-2; i > 0; i-=2) {
			            num += i;               
		        }
		        System.out.println("결과 값 : " + num);
		        break;
		        
		    }
			}

}
