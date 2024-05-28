package arrayex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoTest2 {
	// 1~45 랜덤하게 숫자 배열
	public static void main(String[] args) {
		//입력값
		int[] numArr = new int[6];
		for(int i=0; i<numArr.length; i++) {
			int r = (int)(Math.random()*45)+1;
			// 0부터 나오기 때문에 +1
			numArr[i]=r;
		}System.out.println(Arrays.toString(numArr));
	}		
}

