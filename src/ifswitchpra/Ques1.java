package ifswitchpra;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		System.out.println("값을 입력하시오>");
		Scanner sc1 = new Scanner(System.in); //키보드로 입력받는값
		String x1 = sc1.nextLine(); // 키보드로 받은값 보이게 x1 받아옴
		int i1 = Integer.parseInt(x1); // x1받은값을 i1정수형으로 바꿈
		boolean sr1 = (i1 % 3 == 0); // 정수라 산술연산가능
		if(sr1) {
		System.out.println(x1 + "=Fizz");
		}
	}
}
