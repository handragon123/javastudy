package abstractpkg;

public class AbstractChildClass extends AbstractClass {
	// 추상 메서드를 선언하였으므로 자식에선 사용해야함
	void abstractMethod() {
		System.out.println("추상 메소드 구현");
	}
}
