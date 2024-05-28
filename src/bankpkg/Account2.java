package bankpkg;

public class Account2 {
	private String name;
	private int balance;
	// 맴버변수 캡슐화 (Getter, Setter)메소드 필요
//	public Account2() {
//	}

	public Account2(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
//		return super.toString(); // 부모님의 string인데 필요없는게 많아서 내껄만듬
		return "Account [name=" + name + ", balance=" + balance + "]"; // 자식에서 만들어서 사용
	}

	
	
}
