package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "문자열을 입력하세요 : " );
		String text = scanner.nextLine();
		
		//프로그램 구현
		for(int i=1; i<text.length(); i++) {
			for(int j=0; j<=i; j++) {
			
				//charAt (문장중에 인덱스 위치에 해당되는 문자 추출하기)
				System.out.print(text.charAt(j));
			}
			System.out.println();
		}
		
		
		scanner.close();
	}
}