package loginpkg;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {
		String id = "";
		String password = "";
		String role = "";
		boolean rs = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Login Service");
		System.out.println("Admin or User? {a|u} > ");
		role = sc.next();
		System.out.println("ID > ");
		id = sc.next();
		System.out.println("Password >");
		password = sc.next();
		
		if(role.equals("a") || role.equals("u")) {
			// UserLogin의 role값 생성
			UserLogin login = new UserLogin(role);
			// isLogin의 id,password, role값을 계산
			rs=login.isLogin(id, password, role);
			System.out.println("Login Status :"+ rs);
		} else {
			System.out.println("Login Status :"+ rs);
			
		}
	}

}
