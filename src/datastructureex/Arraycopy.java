package datastructureex;

import java.util.Arrays;

public class Arraycopy {
	public static void main(String[] args) {
		// 3개배열iArr을 5개(tmp)로 바꿔라
//		int[] iArr = {1,2,3};
//		
//		//5개짜리 배열 생성
//		int[] tmp = new int[5];
//		for(int i=0; i<iArr.length; i++) { 
//			// 베열길이 복사.
//			tmp[i] = iArr[i]; 
//		}
//		iArr = tmp; // iArr가 tmp로 들어감(참조주소 iArr에 대입)
//		System.out.println(Arrays.toString(iArr));
//		System.out.println(Arrays.toString(tmp));
//		for(int n :iArr) {
//			System.out.print(n);
//		}
//		
//		tmp[0]=100; // iArr과 같은주소
//		System.out.println(iArr[0]);
//		iArr[1] = 200; // tmp와 같은 주소
//		System.out.println(tmp[1]);
////		tmp = iArr [100,200,3,0,0]
//		System.out.println(Arrays.toString(tmp));
//		int[] tmp2 = iArr; // 참조변수 
////		tmp2 = tmp = iArr [100,200,3,0,0]
//		System.out.println(Arrays.toString(tmp2));
		
		
		// 앞자리 0으로 채우고 데이터 체우기.
		int[] iArr2 = {1,2,3};
		int[] arr3 = new int[6];
		int[] arr4 = new int[6];
		System.arraycopy(iArr2, 0, arr3, 2, iArr2.length);
		System.arraycopy(iArr2, 0, arr4, 3, iArr2.length);
		// (iArr2) 0 부터 arr3 2까지 길이 0
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		iArr2 = arr3;
		System.out.println(Arrays.toString(iArr2));
		
		int[] arr5 = null;
		arr5 = Arrays.copyOf(arr4, arr4.length + 5);
		// arr의 길이에 5칸들려줘
		System.out.println(Arrays.toString(arr5));
		
	}
}
