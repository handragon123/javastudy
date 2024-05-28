package iterationex;

public class ForEx3 {

	public static void main(String[] args) {
		int two=2; // 고정값이므로 변수 설정
		for (int i=1; i<10; i++) {
			int rs2 = two * i; // 결과값 = 변수 * 증가값
			System.out.printf( "%s * %s = %s%n" , two , i , rs2); // 
		}
		System.out.println();
		int three=3;
		for (int i=1; i<10; i++) {
			int rs3 = three * i;
			System.out.printf("%s * %s = %s%n" , three , i, rs3);
		}
		System.out.println();
		
		
		
		
	}
}
