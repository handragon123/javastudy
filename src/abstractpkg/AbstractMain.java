package abstractpkg;

public class AbstractMain {
	
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스 생성 불가능
//		AbstractClass ac = new AbstractClass(); 
		
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}
}
