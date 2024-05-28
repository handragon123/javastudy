package loginpkguserdtoex;

public class UserData {
	private String[] adminData;
	private String[] userData;
	// 싱글톤방식으로 생성자 UserData생성
	private static UserData instance = new UserData();
	// 싱글톤 방식이라 private
	private UserData() {
		adminData = new String[3];
		adminData[0] = "root";
		adminData[1] = "1111";
		adminData[2] = "admin";
		
		userData = new String[3];
		userData[0] = "hong";
		userData[1] = "2222";
		userData[2] = "user";
	}
	public static UserData getInstance() {
		return instance;
	}
	public String[] getAdminData() {
		return adminData;
	}
	public String[] getUserData() {
		return userData;
	}
	
	
}
