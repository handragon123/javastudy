package datastructureex;

public class ArrayForEx2 {

	public static void main(String[] args) {
		// 1~5 저장후 출력하기.
		int[] iArr = new int[10];

		for(int i = 0 ; i<iArr.length;i++) {
			iArr[i]=i;
		}
		for(int i = 0 ; i<iArr.length;i++) {
			iArr[i]=iArr[i]+10;
		}
		
		for (int i=0;i<iArr.length;i++) {
			System.out.println(iArr[i] + "");
		}
		System.out.println();
		for(int i : iArr) { // 지역변수 
			System.out.println(i + "");
		}
		System.out.println();
		String[] sArr = {"red", "green", "yello"};
		for(String s:sArr) {
			System.out.println(sArr);
		}
		
	}

}
