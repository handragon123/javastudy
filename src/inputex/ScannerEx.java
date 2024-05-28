package inputex;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("숫자를 넣으세요>>1");
		Scanner scanner = new Scanner(System.in);
		String x1 = scanner.nextLine();
		System.out.println(x1);
		
		System.out.println("숫자를 넣으세요>>2");
		Scanner scanner1 = new Scanner(System.in);
		String x2 = scanner1.next(); //next는 공백 ,enter로 값 구분하여 각 변수가 있어야함
		String x3 = scanner1.next(); //next는 공백 ,enter로 값 구분하여 각 변수가 있어야함
		int i1 = Integer.parseInt(x2); // i1을 정수로 변환
		int i2 = Integer.parseInt(x3); // i2를 정수로 변환
		int rs = i1 + i2;
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(rs);
		
		System.out.println("숫자를 넣으세요>>3");
		Scanner scanner2 = new Scanner(System.in);
		int i4 = scanner2.nextInt();
		int i5 = scanner2.nextInt();
		int rs2 = i4 + i5;
		System.out.println(rs2);
	}

}
