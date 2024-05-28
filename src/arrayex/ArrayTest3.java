package arrayex;

public class ArrayTest3 {
	public static void main(String[] args) {
		// 데이터의 최대값과 최소값 출력
		 int[] score = { 100, 88, 91, 33, 10, 55, 95}; 
		 
		 int max = 88;
		 int min = 88;
		 
		 for(int i=0; i<score.length; i++) {
			 if(max<score[i]) { //최대값구하기
				 max=score[i];
			 }
			 else if (min>score[i]) {
				 min = score[i]; // 최소값구하기
			 }
		 }
		 System.out.println("최대값 :"  + max);
		 System.out.println("최소값 :"  + min);
	}
}
