package iterationex;

public class ForEx7 {

	public static void main(String[] args) {
		/*
		 (1,1)(1,2)(1,3)
		 (2,1)(2,2)(2,3)
		 (3,1)(3,2)(3,3)
		 */
		
		for (int i = 1;i<4;i++) {
			for (int j=1; j<4; j++) {
				System.out.printf("(%s,%s)", i,j);
			}
			System.out.println();
		}
	}
}
