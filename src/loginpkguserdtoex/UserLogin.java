package loginpkguserdtoex;

public class UserLogin {
	private String id;
	private String password;
	private String role;
	
	// 로그인할떄 사용자인지 관리자인지 분리하는 부분
	public UserLogin(String role) {
		String[] data = null;
		UserData userData = UserData.getInstance();
		if(role.equals("a")) {
			data = userData.getAdminData();
		} else if(role.equals("u")) {
			data = userData.getUserData();
		}
		this.id = data [0];
		this.password = data [1];
		this.role = data [2];
	}
	
	// String id, password, role 받아온버전
	boolean isLogin(String id, String password, String role) {
		boolean rs = false;
		// 지역변수아이디 - this.id와 같아야함
		if(id.equals(this.id)) { // id가같을경우
			if(password.equals(this.password)) { // 비번이 같을경우
				rs = true;
			} else {
				System.out.println("로그인 실패 - password");
			}
		} else {
			System.out.println("로그인 실패 - Id");
		}
		return rs;
	}
	
	
	// UserDTO 사용버전
	boolean isLogin(UserDTO user) {
		boolean rs = false;
		// UserDTO(유저정보 보관소)
		// get으로 아이디 가져옴
		String id = user.getId(); // id변수선언
//		String pw = user.getPassword(); // pw변수선언
		if(id.equals(this.id)) { // id가같을경우
			if(user.getPassword().equals(this.password)) { // 비번이 같을경우
				rs = true;
			} else {
				System.out.println("로그인 실패 - password");
			}
		} else {
			System.out.println("로그인 실패 - Id");
		}
		return rs;
	}
}
