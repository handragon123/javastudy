package arrayex;

public class ArrayTest01 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		// 총점
		for (int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//			sum = sum+score[i];
		}
		sum = 0;
		for(int av :score) {
			sum = sum + av;
		}
		// 평균
		average = sum/score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
