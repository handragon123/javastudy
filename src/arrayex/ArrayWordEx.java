package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWordEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words= {
				// 행 x 열 = 3 x 2
				{"apple", "사과"},
				{"banana", "바나나"},
				{"peach", "복숭아"}
		};
		Scanner sc = new Scanner(System.in);
		// words배열안에 word배열
		for (String [] word : words) {
			String en = word[0];
			String kr = word[1];
			
			System.out.printf("Question. %s의 뜻은?%n" ,en);
			String ans = sc.next(); //입력값 ans
			if(ans.equals(kr)) { // ans와 kr이 같으면
				System.out.println("빙고");
			} else {
				System.out.println("정답은" + kr);
			}
		}
	}

}
