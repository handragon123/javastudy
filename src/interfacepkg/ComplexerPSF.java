package interfacepkg;
// Fax기능까지 추가하여 복합기 만들기
// 상속되지 않은 인터페이서 하나하나 입력하여 대입
public class ComplexerPSF implements Printer, Scanner, Fax {
	// 상속을 받았으므로 오버라이드
	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		 System.out.println(FAX_NUMVER + "에서 "+tel+"로 FAX 전송");
	}
	// 상속을 받았으므로 오버라이드
	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel + "에서 "+FAX_NUMVER+"로 FAX 전송");
	}
	// 상속을 받았으므로 오버라이드
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("scan");
	}
	// 상속을 받았으므로 오버라이드
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
}
