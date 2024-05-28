package exception;

import java.util.Scanner;

public class LoginExceptionMain {
	static final String USER_ID = "hong"; //상수라 변수명 대문자
	static final String USER_PW= "1234";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID > ");
		String inputId = sc.next();
		System.out.println("PW > ");
		String inputPW = sc.next();
		// try,catch문에 넣어서 if문 사용해야함
		try {
			if (!inputId.equals(USER_ID)) {
				throw new LoginException("아이디가 틀립니다.");
			} else if (!USER_PW.equals(inputPW)) {
				throw new LoginException("비밀번호가 틀립니다");

			} else {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
