package loginpkg;
// 로그인기능 구현
public class UserLogin {
	// id, password, role 맴버변수선언
	private String id;
	private String password;
	private String role;
	
	// 로그인할떄 사용자인지 관리자인지 분리하는 부분
	public UserLogin(String role) {
		String[] data = null; // 맴버변수값 초기화
//		getInstance 매소드 호출하여 userData 기능만듬
		UserData userData = UserData.getInstance();
		// 글자가 a이면 getAdminData 값가져옴
		if(role.equals("a")) {
			data = userData.getAdminData();
		} // 글자가 u이면 getUserData 값가져옴 
		else if(role.equals("u")) {
			data = userData.getUserData();
		}
		// UserLogin에 id와 data[0]이 같은지확인
		this.id = data [0];
		this.password = data [1];
		this.role = data [2];
	}
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
}
