package loginpkg;
// 유저의 데이터 생성
public class UserData {
	// 1.접근제한자 private로 adminData와 userData생성
	private String[] adminData;
	private String[] userData;
	// 2.싱글톤방식으로 생성자 UserData생성
	private static UserData instance = new UserData();
	// 싱글톤 방식이라 private
	private UserData() {
		adminData = new String[3];
		adminData[0] = "root";
		adminData[1] = "1111";
		adminData[2] = "admin";
		
		userData = new String[3];
		userData[0] = "hong";
		userData[1] = "222";
		userData[2] = "user";
	} 
	// 싱글톤 UserData 생성
	public static UserData getInstance() {
		return instance;
	}
	// 3. get으로 캡슐화
	public String[] getAdminData() {
		return adminData;
	} // 4. get으로 캡슐화
	public String[] getUserData() {
		return userData;
	}
	
	
}
