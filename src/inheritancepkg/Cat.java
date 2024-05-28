package inheritancepkg;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override //생략해도되는데 부모님꺼 오버라이드인지 인지하기위해서 띄어줌
	public void move() {
		System.out.println("Movie with legs");
	}
	

}
