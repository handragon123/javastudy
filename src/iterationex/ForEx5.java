package iterationex;

public class ForEx5 {

	public static void main(String[] args) {
		// 1~5까지의 합 계산
		int n = 0; 
		int sum = 0; // 더한 sum값 생성
		for ( int i = 1 ; i < 6 ; i ++) {
			n++; // n증강
			sum = sum+ n; // sum + 증강값 sum에 저장
		}
		System.out.println(n + "/" +sum);
		sum=0;
		for (int i=1; i<6; i++) {
			sum= sum+i;
		}
		System.out.println(sum);
		
	}
}
