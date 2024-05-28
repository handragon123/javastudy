package controlpra;

public class Que8 {
// 1,3,5,7 을 먼저 찍는 연습을해야함.
	 public static void main(String[] args) {
		 int star = 13; // 별의 갯수를 처음 정해줘야함
	        int space = star / 2; // 별갯수를 2로 나누어 공백칸구함
	        for(int i=1; i<=star; i+=2) { // 별을 13개찍는작업
	            for(int j=0; j<space; j++) { // 공백나오는 작업               
	                System.out.print(" ");
	            }
	            for(int k=0; k<i; k++) { // 별의 갯수, 
	                System.out.print("*"); // 별 출력
	            }
	            space--; // 공백 칸한칸 줄이고 다시 위로
	            System.out.println();
	        }
	    }
	 }
