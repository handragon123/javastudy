package operatorex;

public class ArithmethicEx {
	 public static void main(String[] args) {
	        int x1 = 100;
	        int x2 = 10;

	        int iResult = 0;        
	        String sResult = "";

	        iResult = (x1 > x2) ? (x1 - x2) : (x2 - x1);    //참이기떄문에 x1-x2 가 실행    
	        sResult = (x1 < x2) ? "참" : "거짓"; //거짓이기떄문에 거짓 실행

	        System.out.println(iResult);
	        System.out.println(sResult);

	    }
}
