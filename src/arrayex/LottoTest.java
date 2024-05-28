package arrayex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoTest {
	// 1~45 랜덤하게 숫자 배열
	public static void main(String[] args) {
		//입력값
		int[] numArr = new int[45];
		for(int i=0; i<numArr.length; i++) {
			// 0부터 나오기 때문에 +1
			numArr[i]=i+1;
		}
//		System.out.println(Arrays.toString(numArr)); //입력값
		// 500번돌려서 랜던값출력
		for (int i = 0 ; i <100;i++) {
			int r = (int)(Math.random()*45);
			int tmp = numArr[0]; //tmp배열 생성
			numArr[0] = numArr[r]; // numArr0 번쨰 자리에 랜던값대입
			numArr[r] = tmp; // 랜던값 r tmp에 대입
		}
		System.out.println(Arrays.toString(numArr)); // 랜던값 출력
		// 6자리 출력
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = numArr[i];
		}
		System.out.println(Arrays.toString(lotto)); //정렬전
////		sortUtil 을 참조변수로 받아줌
//		SortUtil sortUtil = new SortUtil();
//		sortUtil.bubbleSort(lotto); // 메소드에 lotto대입
//		System.out.println(Arrays.toString(lotto)); // 정렬후
	}		
}

