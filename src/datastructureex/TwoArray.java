package datastructureex;

import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
		int [] [] iArr = new int [3][3]; // 3행

		int n = 0;
		// 값입력 부분
		for(int i=0; i<iArr.length;i++) {
			//			iArr[i].length = i번쨰 인댁스에 길이
			for(int j=0;j<iArr[i].length;j++) {
				System.out.printf("(%s,%s)",i,j);
				iArr[i][j]= ++n;
			}
			System.out.println();
		}

//		// 1~9 출력
//		for(int i=0; i<iArr.length;i++) {
//			//			iArr[i].length = i번쨰 인댁스에 길이
//			for(int j=0;j<iArr[i].length;j++) {
//				System.out.printf("(%s)",iArr[i][j]);
//			}
//			System.out.println();
//		}
		
//		// 1차원 for + Arrays.toString()
//		int [] tmp = iArr[0]; 
//		for (int i = 0;i<iArr.length;i++) {
//			System.out.println(Arrays.toString(iArr[i]));
//		}
		
		// for(:) 출력
		for (int[ ] ir : iArr) {
			for (int i : ir) {
				System.out.printf(" %s " ,i);
			} 
			System.out.println();
		}
	}
}
