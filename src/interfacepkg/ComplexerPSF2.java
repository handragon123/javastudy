package interfacepkg;
// 상속된 IComplexerPrintScanFax 인터페이스 대입
public class ComplexerPSF2 implements IComplexerPrintScanFax {

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		 System.out.println(FAX_NUMVER + "에서 "+tel+"로 FAX 전송");
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel + "에서 "+FAX_NUMVER+"로 FAX 전송");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("scan");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}
