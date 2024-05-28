package controlpra;

public class Que9 {

	 public static void main(String[] args) {
		    for(int j=1;j<7;j++) {
		    	for(int i = 1 ; i < 7 ; i ++) {
		    		// J+i 의 값 변수 선언
		    		int sum = j+i;
		    		// sum 이 6일경우 출력
		    		if (sum == 6) {
		    			System.out.printf("(%s, %s)",j , i);
		    		}
		    	} System.out.println();
			    }
	    }
}