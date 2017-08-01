package practice01;

public class Prob5 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++) 
		{
				int clap=0; // 쳐야될 박수 횟수
				String num= ""+i; //int형의 숫자값을 String 타입으로 받습니다. 
				
				for(int j=0; j<num.length(); j++);
				{
				if(num.equals("3")||num.equals("6")||num.equals("9"))
				{
					clap++;
				}
			
		System.out.print(i + ":");
				if(clap!=0) {
					for(int k =0; k<clap; k++)
					{
						System.out.print("짝");
					}
				}
				else
				{
				}
				System.out.println();
				}
	}
}
}
