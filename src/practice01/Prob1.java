package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		//프로그램 구현 
		int num =0;
		Scanner scanner = new Scanner( System.in);
		System.out.println("수를 입력하시오 : ");
		num= scanner.nextInt();
		if((num%3)==0) {
			System.out.println("3의배수입니다.");
		}else {
			System.out.println("3의배수가 아닙니다. ");
		}
		
		
	}
}
