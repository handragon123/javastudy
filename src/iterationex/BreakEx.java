package iterationex;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		target:for (int i=0 ; i<10 ; i++) { // i범위
			for (int j=0;j<5;j++) { //j의 범위
				if(j==3) { //j가 3이면 멈춰라.
					break target;
				}
				System.out.printf("%s,%s" ,i,j);
			}
			System.out.println();
			}
		}
	}


