package interfacepkg;

public class ComplexerMain {

	public static void main(String[] args) {
		// 프린트,스캐너 복합기기능 생성
//		ComplexerPS cps = new ComplexerPS();
//		cps.print();
//		cps.scan();
//		// 프린트,스캐너,팩스 복합기기능 생성
//		ComplexerPSF cpsf = new ComplexerPSF();
//		cpsf.print();
//		cpsf.scan();
//		cpsf.send("02-123-13"); // tel값으로 보넴
//		cpsf.receive("02-2222222-22"); // tel값에서 보냄
		
		// interface가 추상이라 new안댐
//		Fax fax = new Fax(); 그래서 구현을해야함
		// Fax 기능만 구현
		Fax fax = new Fax() {
//			fax받아왔으므로 오버라이드
			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				 System.out.println(FAX_NUMVER + "에서 "+tel+"로 FAX 전송");
			}
//			fax받아왔으므로 오버라이드
			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println(tel + "에서 "+FAX_NUMVER+"로 FAX 전송");
			}
		};
		fax.send("02-123-13");
		fax.receive("02-2222222-22");
	}

}
