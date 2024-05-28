package iterationex;

public class ForEx2 {

	public static void main(String[] args) {
		int k = 6;
		for (int i=0 ; i<5 ; i++) { //(초기화식; 조건식; 증감식)
			k=k-1;
			System.out.print(k + "");
		}
		for(int i=5; i>0; i--) {  
            System.out.print(i + " ");
        }
		for(int i=6; i>1; i--) {            
            System.out.print(i-1 + " ");
        }
        System.out.println();

	}
}
