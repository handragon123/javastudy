package classex;

public class Dog {
	// 멤버변수
	// 인스턴스 변수로 new했을때 만들어짐
	String name; // null
	int age; // 0
	
	// 기본 생성자 
	public Dog() {
		// 오버로딩 된 생성자가 없을때 생략가능. - 거의 그럴일 없음
	}
	// Dog오버로딩 - 파라미터 타입이나 개수가다르면 가능.
	public Dog(String name) {
//		name = name; // name을 쓰면 가상머신이 멤버변수 name과 구별을못해서 null값이 뜸 
		this.name = name; // this 인스턴스변수를 받아옴, 멤버변수와 매개변수값이 같을때 this사용
	}
	// Dog오버로딩
	public Dog(int age) {
		//this는 인스턴스화 되었을 때의 그 인스턴스의 생성자들을 가리킴
		this.age = age;
	}
	// Dog오버로딩
	public Dog(String name, int age) { 
		this.name=name; // this-생성자로 멤버변수 초기화
		this.age = age;
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "멍멍이";
		dog.age= 10;
		
		System.out.println(dog.name);
		
		Dog dog2 = new Dog("멍멍이2");
		System.out.println(dog2.name);
		
		Dog dog3 = new Dog(7);
		System.out.println(dog3.age);
		
		Dog dog4 = new Dog("멍멍이4" , 4);
		System.out.println(dog4.name);
		System.out.println(dog4.age);
	}
}
