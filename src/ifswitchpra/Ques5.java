package ifswitchpra;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
	
		System.out.println("년도를 입력하시오");
		Scanner sc = new Scanner(System.in); // 입력받은값
		int year = sc.nextInt(); // 입력받은값 정수로 출력
		boolean sr1 = (year % 4 == 0 && year % 100 != 0);//년도가 4의배수이면서 100의 배수가아닐떄
		boolean sr2 = (year % 400 == 0); //년도가 400의 배수
		boolean sr3 = (sr1 || sr2); // sr1 , sr2 둘중하나만 맞으면 충족
		if (sr3) {
			System.out.println( year + "년은 윤년입니다");
		} else {
			System.out.println( year + "년은 윤년아닙니다");
		}
	}
	

}
