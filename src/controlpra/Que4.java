package controlpra;

public class Que4 {

	public static void main(String[] args) {
			int sum = 0; // 합 초기화
			int totalsum = 0; // 모든 합 초기화
			for (int i=1; i<11 ; i++) {
				sum = sum + i; // 1~10까지 더한값
				// 더한값을 더한값
				totalsum=totalsum+sum;
			}
			System.out.println(totalsum);
		
		
	}

}
