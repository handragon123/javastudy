package arrayex;

import java.util.Arrays;

public class ArraySortEx {
	public static void main(String[] args) {
		// 0~99 자리입력
		int[]numArr = new int[10];
		for(int i=0; i<numArr.length; i++) {
			int r = (int)(Math.random()*100);
//			numArr i 에 r대입
			numArr[i] = r;
		}
		System.out.println(Arrays.toString(numArr));
		// 2차 for문으로 앞뒤 계속 바꿔줌
		for (int j = 0;j<numArr.length -1 ; j++) {
			boolean changed = false; // 바뀔자리가없으면 false
			// 앞자리 숫자와 뒷자리 숫자 비교하여 자리바꿔줌
			// numArr.length -1-i = 전체 길이에서 -1번줄이고
			// -j는 가장큰수는 j가 돌아갈떄마다 뒤로가기때문에 횟수줄여줌
			for (int i = 0;i<numArr.length -1 -j; i++) {
				if(numArr[i] > numArr[i+1]) { // 앞인덱스가 뒤 인덱스보다 크면
					int tmp = numArr[i]; // tmp에 i대입
					numArr[i] = numArr[i+1]; // i에 i+1 값저장
					numArr[i+1] = tmp; // i+1 을 i로
					changed = true; //바뀔자리가 있으면 true
				}
			}
//			바뀔자리가 없으면 나와라
			if(!changed) break;
			// 중간 for문 반복으로 앞듸 바꿈
			System.out.println(Arrays.toString(numArr));
		}
		// 최종 for문반복으로 순서 나열
		System.out.println(Arrays.toString(numArr));
	}
}
