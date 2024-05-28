package ifswitchpra;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		
		System.out.println("값을 입력하시오>"); // 입력받을값 띄어주기
		Scanner sc2 = new Scanner(System.in); // 키보드에서 입력받은값 sc2로 전달
		String x2 = sc2.nextLine(); // sc2 에서 보여주게 x2 로 전달
		int i2 = Integer.parseInt(x2); // 산술연산 할수있게 int로 변환
//		boolean sr2 = (i2 % 5 == 0);
		if(i2 % 5 == 0) {
			System.out.println(x2 +"=Buzz");
		}
		
	}

}
