package javaapipkg;

import java.util.Arrays;

public class CloneEx {

	public static void main(String[] args) {
		String[] arr = {"hong", "kim", "lee", "park"};
		String[] arr2 = arr.clone(); // 값 복사
		String[] arr3 = arr; // 주소 복사
		System.out.print(arr==arr2); // false
		System.out.println();
		System.out.print(arr==arr3); // true
		System.out.println();		
		for(String s : arr2) {
			System.out.print(s);
		}
//		System.out.println();
		String[] arr4 = new String[arr.length + 5];
		// 문자라 null 5개 추가
		System.out.println();
		System.arraycopy(arr, 0, arr4, 0, arr.length);
		for(String s : arr4) {
			System.out.print(s);
		}
	}
}
