package datastructureex;

public class ArrayForEx {

	public static void main(String[] args) {
		// 1~5 저장후 출력하기.
		int[] iArr = new int[10];
		for (int i =0; i<10; i++) {
			iArr[i] = i+1 ;
		}
		// 출력
		for(int i = 0 ; i<10;i++) {
			System.out.println(iArr[0]);
		}
		
		int sum = 0;
		for(int i = 0 ; i<10;i++) {
			sum=sum+iArr[i];
			System.out.println(i);
		}
	}

}
