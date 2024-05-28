package controlpra;

public class Que1 {

	public static void main(String[] args) {
		int sum1 = 0; 
		int sum2 = 0;
		for (int i = 1; i<101;i++) {
			if(i % 2 == 0) { // 짝수일때
				sum1 =sum1 + i;
			} else {
				sum2 = sum2+i;
			}
			
		}
		System.out.println("짝수의 합" + sum1);
//			System.out.println();
		System.out.println("홀수의 합" + sum2);
	}

}
