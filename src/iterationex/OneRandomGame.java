package iterationex;

import java.util.Scanner;

public class OneRandomGame {

	public static void main(String[] args) {
		// 1부터 100사이의 	Random한 1개의 숫자 맞추기게임
		int com = (int)(Math.random()*100) + 1; // com변수는 random으로 돌린 숫자에 100을곱하여 
		// 십의자리를 만들어주고 + 1 을하여 0부터가아닌 1부터 100사이로 지정해주었다
		Scanner scanner = new Scanner(System.in); // scanner 는 사용자 입력값이다.
		int count = 0; // 사용자가 시도한횟수 초기화
		
		while(true) {
			System.out.println("user >"); // 화면에 비추는 user
			int user = scanner.nextInt(); // user가 입력한값을 정수로 바꿔 화면에 보여줌
			count++; // 사용자가 시도한 횟수 추가
			if(com==user) { // com의 random숫자와 user의 적은답이 같을때
				System.out.println(count + "번시도 정답"); 
				break; //  break; 로 함수종료
			}
			if(user<com) { // com의 random숫자가 user답보다 클때
				System.out.println("더커야함");
			} else { // com의 random숫자가 user보다 작을때
				System.out.println("더작아야함");
			}
		}
	}
}
