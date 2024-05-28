package datastructureex;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		String s1 = "red";
		String s2 = "green";
		String s3 = "blud";
		
		String[] sArr = new String[3];
		sArr[0] = "red";
		sArr[1] = "green";
		sArr[2] = "blue";
		
		//선언하면서 한번에 초기화하는방법
		String[] sArr2 = {"red", "green", "blue"};
		
		int[] iArr = {1,2,3,4,5};
		System.out.println(sArr[1]); //green
		System.out.println(iArr[3]); // 4
		
		// 배열값 전체를 확인할때.
		System.out.println(Arrays.toString(sArr2));
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(sArr));
		
		// 배열의 길이
		int len = sArr2.length;
		System.out.println(len);
 	}
}
