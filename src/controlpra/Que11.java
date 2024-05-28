package controlpra;

public class Que11 {

	 public static void main(String[] args) {
		 // 2x, 4y 의 넣을 변수선언
		    int num1 = 2;
		    int num2 = 4;
		    // x, y 값의 범위 설정
		 for (int x = 0 ; x <=10;x++) {
			 for (int y = 0; y<=10;y++) {
				 // 방정식에 대입
		    	 int sum = num1*x + num2*y;
//		    	 sum이 10일경우 출력
		    	 if(sum == 10) {
		    		 System.out.print("2x+4y=10의 x,y 값은");
		    		 System.out.println();
		    		 System.out.printf("x=%s , y=%s , %s%n" , x , y, 10);
		    	 }
		     	}
		    }
	     
	    }
}