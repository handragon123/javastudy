package bankpkg;

public class AccountMain {

	public static void main(String[] args) {
		String name = "Kim";
		int balance = 0;
		Account account = new Account(name, balance); 
		// 2. pravte 함수 사용하면 접근 불가로 오류가뜸
//		account.name = "";
//		account.balance = -10000;
		
		// 5. set으로 값 대입
//		account.setName("kim");
//		account.setBalance(0);
		// get으로값을 불러와도됨
//		System.out.println(account.getName());
//		System.out.println(account.getBalance());
		
		Account2 account2 = new Account2(name, balance);
		account2.setName("hong");
		account2.setBalance(1000);
		System.out.println(account.toString());
		System.out.println(account2);
		
		// 원래는 제일 최상의 부모 클래스로 상속
//		 Object o = new Object();
//		 o.toString(); // 부모클래스 함수로 원래 상속되는값인데 자식에서 편집가능.
		//public class AccountMain extends Object 원래 이모습인데
		// 너무 당연해서 생략
		
		DepositService service = new DepositService();
		// work를 통해서만 접근이 가능함.
		service.work();
		
		// getInstance로 호출 static이라 사용가능
		SingletonBank bank1 =  SingletonBank.Instance();
		SingletonBank bank2 =  SingletonBank.Instance();
		System.out.println(bank1);
		System.out.println(bank2);
		// 같은 구조상에서 사용하기떄문에 동일하다.
	}

}
