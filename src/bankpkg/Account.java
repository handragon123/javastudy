package bankpkg;

public class Account {
	// 1. 개발자가 직접 접근하지 못하게 private 로 막음
//	String name;
//	int balance;
	private String name;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	//3. set사용하여 메소드를 만들어서 접근할수있게 함
	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			//이름이 비어있거나 null값일떄
			System.out.println("null이나 빈문자열금지");
			return;
		} // 정상적이름들어가면 name생성
		this.name=name; // 생성자 초기화 문법
	}
	
	// 4. get으로 가져옴
	public String getName() {
		return this.name;
	}
	
	public void setBalance(int balance) {
		if(balance<0) {
			System.out.println("0보단 적을수는 없다.");
			return;
		}
		this.balance = balance;
	}
	
	public int getBalance () {
		return this.balance;
	}
}
