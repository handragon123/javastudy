package iterationex;

public class ForEx8 {

	public static void main(String[] args) {
		
		
		int one = 1;
		int two = 0;
		for (int i=1; i<6; i++) {
			for (int j=1; j<6; j++) {
				two++;
				System.out.print(two);
		     }
			System.out.println(two);
		}
		
		int one1 = 0;
		int two1 = 1;
		for (int j=1; j<6; j++) {
			one1++;
			for (int i=0; i<6; i++) {
				System.out.print(one1);
			}
			System.out.println();
	     }
		
	}
}
