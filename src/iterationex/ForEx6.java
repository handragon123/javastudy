package iterationex;

public class ForEx6 {

	public static void main(String[] args) {
		/*
		 *****
		 *****
		 *****
		 *****
		 *****
		 */
		String star = "*";
		for (int j=0;j<5;j++) { //5개 생성된 별을 5줄로 만들어줌
			for(int i=0;i<5;i++) { // 별 5개생성 for문
				System.out.print(star); // 한줄에 별 5개생성			
			}
			System.out.println(); // println으로 5줄만들기
		}
	}
}
