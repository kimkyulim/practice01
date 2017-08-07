package practice01;

public class Prob5 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			String num = String.valueOf(i);
			String clap = "";
			
			// 받아온 문자열의 길이만큼 돌려서 판단			
			for(int j = 0; j < num.length(); j++) {			
				if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					clap += "짝";
				}
			}
			
			if (!clap.equals("")) {
				System.out.println(num + " " + clap);
			}
		}
	}
}
	
