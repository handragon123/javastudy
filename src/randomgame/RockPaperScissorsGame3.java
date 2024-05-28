package randomgame;

import java.util.Scanner;

public class RockPaperScissorsGame3 {

// 숫자 입력시 문자열로 변환
	static String trans(int n) {
		String str = "";
		if(n == 0) str = "가위";    //숫자 0 이면 가위
		else if(n == 1) str = "바위"; // 숫자 1이면 바위
		else str = "보"; // 그외숫자  보

		return str;
	}
// 문자 입력시 숫자로 변환	
	static int trans02(String s) {
		int rs = 0;
		if(s.equals("가위")) rs = 0; // 가위 입력시 0
		else if(s.equals("바위")) rs = 1; // 바위 입력시 1
		else rs = 2; // 보 입력시 2

		return rs;
	}
	
	// int user, int com, String sUser, String sCom 값을 받아서 함수 실행.
	// 가위바위보 게임 함수
	static void process(int user, int com, String sUser, String sCom) {
		// user가 지는 경우 : -1, 2
		// user가 이기는 경우 : -2, 1
		int cal = user - com;

		if(cal == -1 || cal == 2) {
			System.out.printf("user %s, com %s, com 승리\n",sUser, sCom);
		}else if(cal == -2 || cal == 1) {
			System.out.printf("user %s, com %s, user 승리\n",sUser, sCom);
		}else {
			System.out.printf("user %s, com %s, 비김\n",sUser, sCom);
		}	
	}

	static void game01() {
		while(true) {		
			Scanner sc = new Scanner(System.in);
			int com = (int)(Math.random()*3); // 컴퓨터 랜덤숫자 0~1
			System.out.println("0,1,2 end:9 숫자>");
			int user = sc.nextInt(); // 입력숫자 출력
			if(user == 9) { // 게임 종료
				System.out.println("End!!");
				break;
			}
			if(user > 2 || user < 0) { // 다른숫자 입력시 알림
				System.out.println("0 ~ 2 사이의 숫자를 넣으세요");
				continue;
			}
//			trans 함수에서 숫자 입력시 문자열로 바꿔줌
			String sUser = trans(user);
			String sCom = trans(com);			
			// 가위바위보 게임실행
			process(user, com, sUser, sCom);
		}
	}
	static void game02() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			int com = (int)(Math.random()*3); // 컴퓨터값 0~2 랜덤 생성
			System.out.println("가위, 바위, 보 end:9 문자>"); 
			String sUser = sc.next(); // 사용자가 문자열 입력
			
			if(sUser.equals("9")) { // 문자열이기때문에 equals 사용
				System.out.println("End!!");
				break;
			}
			
			String sCom = trans(com); // 컴퓨터는 애초에 숫자이기때문에 문자로받고 string 으로받아줌
			int user = trans02(sUser);	// trans02함수로 문자열을 숫자로 바꿔줌
			// 게임 실행
			process(user, com, sUser, sCom);
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 선택하세요.");
		System.out.println("숫자로 입력 1, 문자로 입력 2");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			game01(); // 1번 숫자 게임 실행
			break;

		case 2:
			game02(); // 2번 문자열 게임 실행
			break;
		}
	}

}
