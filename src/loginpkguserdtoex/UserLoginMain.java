package loginpkguserdtoex;

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
			UserLogin login = new UserLogin(role);
			// 참조변수 DTO도 NEW해서 사용해야함.
			UserDTO user = new UserDTO(id,password,role);
			rs =login.isLogin(id, password, role);
			System.out.println("Login Status :"+ rs);
			rs =login.isLogin(user);
			System.out.println("Login Status DTO :"+ rs);
		} else {
			System.out.println("Login Status :"+ rs);
			
		}
	}

}
