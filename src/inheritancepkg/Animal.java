package inheritancepkg;
// extends object 생략가능
public class Animal extends Object {
	private String name; //private 사용하므로 getter,setter사용
	private int age;
	
//	public Animal() {
//		// TODO Auto-generated constructor stub
//	}
	
	// 부모생성자 오버로딩. - Animal기본생성자 사라짐
	public Animal(String name, int age) {
//		super(); // Object (생략가능)
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("Eat!");
	}
	public void move() {
		System.out.println("move!");
	}
	public void sleep() {
		System.out.println("sleep!");
	}

	// get 보내주기떄문에 리턴타입있고
	// set 받기떄문에 받을 값이있음
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
}
