package bankpkg;

public class DepositService {
	// 접근못하게 private사용
	private void open() {
		System.out.println("Open");
	}
	private void deposit() {
		System.out.println("Deposit");
	}
	private void end() {
		System.out.println("End");
	}
	
	// work는 사용가능하게 public으로 묶어줌
	public void work() {
		open();
		deposit();
		end();
	}
}
