package bankpkg;

public class SingletonBank {
	// 싱클톤 기법 = 생성자 캡슐화
	private static SingletonBank instances = new SingletonBank();
	
	// 생성자에 private 접근 제한
	private SingletonBank() {
		System.out.println("생성자");
	}
	// public 사용하여 매서드명(Instance)를 만들어서 사용가능
	public static SingletonBank Instance() {
		return instances;
	}
}
