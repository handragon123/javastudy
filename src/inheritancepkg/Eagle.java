package inheritancepkg;

public class Eagle extends Animal{
	public Eagle(String name, int age) {
		super(name, age);
	}

	@Override
	// 부모 오버라이드
	public void move() {
		System.out.println("Movie with wing");
	}
}
