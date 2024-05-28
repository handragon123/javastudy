package ifswitchpra;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		
		System.out.println("값을 입력하시오>"); // 입력받을값 띄어주기
		Scanner sc3 = new Scanner(System.in); // 입력받은값 받기
		String x3 = sc3.nextLine(); // 입력받은값 화면에 표시
		int i3 = Integer.parseInt(x3); // 입력받은값 정수변환
		boolean sr = (i3 % 3 == 0 && i3 % 5 ==0); // 입력받은값 논리연산
		if (sr) {
			System.out.println(x3 + "= FizzBuzz");
		}
	}
	

}
