package practice01;

public class Prob2 {
	public static void main(String[] args) {
		/*
		 * for(int a=1; a<10; a++) { for(int j=0; j<10;j++) { System.out.print(a + j
		 * +" ");
		 * 
		 * } System.out.println(); }
		 */

		/*for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++){
		System.out.print("*");
			}
			System.out.println();
	}*/
		
	/*for(int i=0; i<5; i++) {
		for(int j=5; j>i; j--) {  // 횟수 
			System.out.print("*");
		}
		System.out.println();
	}*/
		
	
	for(int i = 1; i <= 5; i++) {
		for(int j = 0; j <= 5 - i; j++){
			System.out.print(" ");
		}
		
		for (int j = 5; j > 5 - i; j--) {
			System.out.print("*");
		}
		
		System.out.println();
	}
		
	}
}