package iterationex;

public class ForEx4 {

	public static void main(String[] args) {
		//1~10 까지 짝수 만 출력
		int k = 0;
		for (int i = 0; i<11 ;i++) {
			k++;
			if (k % 2 == 0) { //홀수 변경시 == 대신 =!
				System.out.print(k + " ");
			}
		}
		System.out.println();
		for (int i=0 ; i<10 ; i++) {
			if ((i+1) % 2==0) {
				System.out.print((i+1) + " "); // 홀수 변경시 i+1 -> i
			}
		}
		System.out.println();
		for(int i=1 ; i<11 ; i++) {
			if (i % 2 == 0) { // 홀수 변경시 i%2==1
				System.out.print(i + " "); 
			}
		}
	}
}
