package javaapipkg;

import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		Random r = new Random(); 

		// nextInt 0 이상 n 미만
		for(int i=0; i<5 ; i++) {
			System.out.println(r.nextInt(50));//Int()값내에서 i만큼 실행
		}
		// boolean 값
		for (int i=0; i<5; i++) {
			System.out.println(r.nextBoolean());
		}
		// 정규표준편차 값 (평균 0, 분산 1)
		for (int i=0; i<5; i++) {
			System.out.println(r.nextGaussian());
		}
	}
}
