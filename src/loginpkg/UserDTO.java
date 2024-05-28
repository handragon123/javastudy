package loginpkg;
// 유저정보 묶어놓음
public class UserDTO {
	private String id;
	private String password;
	private String role;
	
	// role이 없을때
	public UserDTO(String id, String password) {
		super(); // 부모 상속관계라 생략가능
		this.id = id;
		this.password = password;
	}
	// role이 있을때
	public UserDTO(String id, String password, String role) {
		super();
		this.id = id;
		this.password = password;
		this.role = role;
	}
	// getter, setter 모두 생성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	// toString 자식이 재정의.
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
