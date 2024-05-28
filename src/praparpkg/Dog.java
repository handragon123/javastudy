package praparpkg;

// 부모 클래스 상속 extends
public class Dog extends Animal{
	// 오버로딩전 class 빨간불 들어올때 오버로딩 클릭후 생성
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Dog() {
		super("덕구", 5);
	}

	
	 
}
