package interfacepkg;
// printer, scanner를 상속받아 복합기 만들기
// interface에서 상속은 implements로 받는다.
public class ComplexerPS implements Printer, Scanner {
	// 상속을 받았으므로 부모 메서드 오버라이드
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("scan");
	}
	// 상속을 받았으므로 부모 메서드 오버라이드
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}
