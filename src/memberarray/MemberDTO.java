package memberarray;
// 회원정보를 저장하는 클래스
public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public MemberDTO() {
	}
	// 오버로딩 하여 생성
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// 데이터 주고받기위해 get,set메소드 생성
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
