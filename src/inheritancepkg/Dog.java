package inheritancepkg;

public class Dog extends Animal{
	// 1. 기본생성자에 super();를 부르면 기본생정자, super()생략가능
	// 2. 기본생정자 안에 super()만 없어도 사용가능
//	public Dog() { // 부모에 생성자가없으면 dog생성자 사용못하므로 super값에 값대입
//		super("초롱이" , 3);
//	} - 기본 생성자 지우면 부모에서 dog기본생성자 사용못함
	
	// overloading된 super()호출
	// 매개변수 가져와서 부모 값 대입
	public Dog(String name, int age) {
		super(name,age);
	}

}
