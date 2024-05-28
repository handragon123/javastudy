package iterationex;

public class WhileEx3 {

	public static void main(String[] args) {
		// 별 5x5 띄우기
		int i = 0;
        while(i<5) {
            i++;
            // 1단계
            int j=0;
            while(j<5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

	}

}
