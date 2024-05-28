package controlpra;

public class Que3 {

	 public static void main(String[] args) {
	        for(int i=1; i<101; i++) {
	        	// 조건식 3,5의 배수
	            if(i % 3 == 0 && i % 5 == 0) {
	                System.out.print("FizzBuzz" + " "); 
	                // 3의배수
	            }else if(i % 3 == 0){
	                System.out.print("Fizz" + " ");
	                // 5의배수
	            }else if(i % 5 == 0){
	                System.out.print("Buzz" + " "); 
	                // 아닌경우 숫자 표현
	            }else {
	                System.out.print(i + " ");
	            } // 줄이길어서 10자씩 자름
	            if (i%10==0) {
	            	System.out.println();
	            }
	        }
	    }
}
