package classex;

public class Cat {
	String name;
	int age;
	
	public Cat() { 
		// 생성자 this
		this("나비", 1);
	}
	public Cat(String name, int age) {
		// 인스턴스 변수 받는 this
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.name);
		System.out.println(cat.age);
	}
}
