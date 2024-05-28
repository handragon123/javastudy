package iterationex;

public class InfiniteRandomEx {

	public static void main(String[] args) {
		// Random 0~10, 0 탈출 
//		for (int i=0; i<10; i++) {
//			// 0~0.9999999999
//			double r = Math.random() * 4; // 10을곱하면 0~9의자리  100을곱하면 0~99
////			random은 실수라 정수형으로 변환
//			int n = (int)r;
//			System.out.println(n);
//		}
		while (true) {
			// 0~0.9999999999
			// 0~10
//			random은 실수라 정수형으로 변환
			int r = (int)(Math.random() * 11);
			if (r == 100 ) {
				break;
			}
			System.out.println(r);
		}
	}
}
