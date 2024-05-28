package randomgame;

import java.util.Random;
import java.util.Scanner;

public class RockSiPapGame2 {
	
	//숫자열 줄게 문자열 return
	static String trans(int n)  {
		//		0,1,2일때 문자열 가위,바위,보 설정
		String str = "";
		if(n == 0 ) {
			str = "가위";
		} else if ( n == 1) {
			str = "바위";
		} else str = "보";
		return str;
	}
	
	//문자열을 숫자열로 return
	static int trans02(String s)  {
		//		0,1,2일때 문자열 가위,바위,보 설정
		int rs = 0;
		if(s.equals("가위")) rs = 0; 
		else if(s.equals("바위")) rs = 1;
		else rs = 2;
		
		return rs;
	}
	
	static void process(int user, int com, String sUser, String sCom) {
		int cal = user - com ;
		
		if ( cal == -1 ||cal == 2) {
			System.out.printf("user %s , com %s , 컴퓨터 승리 %n" , sUser,sCom);
		}else if (cal == -2 || cal == 1) {
			System.out.printf("user %s , com %s , 유저 승리 %n" , sUser, sCom);
		} else {
			System.out.printf("user %s , com %s , 비김 %n" , sUser,sCom);
		}
	}
	
	static void game01() {
		while (true) {
			Scanner sc = new Scanner(System.in); // user값 입력받기
			int com = (int)(Math.random()*3); // com값음 컴퓨터 랜던값

			System.out.println("0,1,2 숫자 > ");
			int user = sc.nextInt();  // 입력받은값 표시
			if(user == 9) { // 9 입력시 게임종료
				System.out.println("게임종료");
				break;
			}
			if (user > 2 || user < 0) {
				System.out.println("0~2사이 숫자 입력사세요");
				continue;
			}
			//trans 메소드 사용
			String sUser = trans(user);
			String sCom = trans(com);

			process(user, com, sUser, sCom);
		}
	}
	
	static void game02() {
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			int com=(int)(Math.random()*3);
			System.out.println("가위, 바위, 보 end:9  문자>");
			String sUser = sc.next();
			
			if(sUser.equals("9")) { // 9 입력시 게임종료
				System.out.println("게임종료");
				break;
			}
			String sCom = trans(com);
			int user = trans02(sUser);
			process(user, com, sUser, sCom);
		}
	}

	public static void main(String[] args) {
		// com이 이기는경우 : -1, 2
		// user가 이기는경우 : -2, 1
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 선택사세요");
		System.out.println("숫자로 입력 1, 문자로 입력 2, 종료 9");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 :
			game01();
			break;

		case 2 :
			game02();
			break;
		}

	}
}