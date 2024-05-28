package ifswitchpra;

import java.util.Scanner;

// 2개의 정수를 입력받아서 각각의 수가 짝수면 합을 구하고 한개라도 홀이면 곱을 출력
public class Ques4 {

	public static void main(String[] args) {
	
		System.out.println("두 정수 값 입력하시오");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int i1 = sc1.nextInt(); //nextInt로 저절로 정수형 변환 
		int i2 = sc2.nextInt(); //nextInt로 저절로 정수형 변환
		boolean sr1 = (i1 % 2 == 0 && i2 % 2 ==0); // 둘다 짝수일 경우
		if (sr1) {
			System.out.println(i1+i2); // 더하기
		} else { // 짝수가 아닐경우
			System.out.println(i1 * i2); // 곱하기
		}
	}
}
