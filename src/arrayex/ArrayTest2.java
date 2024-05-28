package arrayex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
		}
		System.out.println(Arrays.toString(numArr));
		
		// 500번돌려서 랜던값출력
		for (int i = 0 ; i <500;i++) {
			int r = (int)(Math.random()*10);
			int tmp = numArr[4]; //tmp배열 생성
			numArr[4] = numArr[r]; // numArr0 번쨰 자리에 랜던값대입
			numArr[r] = tmp; // 랜던값 r tmp에 대입
		}
		System.out.println(Arrays.toString(numArr));
		
	}		
}

