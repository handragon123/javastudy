package abstractpkg;

public abstract  class AbstractClass {
	// 변수 선언
	int age; 
	//구현된 메소드(){ 
	void generalMethod() {
		System.out.println("일반 메소드");
	}
	// 추상 메소드 선언
	abstract void abstractMethod();
}
