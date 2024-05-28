package abstractpkg;

public class FinalClass extends AbsClass2{
	

	
	void finalMethod() {
		System.out.println("final: finalMethod");
	}

	@Override
	void abMethod2() {
		// TODO Auto-generated method stub
        System.out.println("abMethod2 메소드 구현");
	}

	@Override
	void abMethod1() {
		// TODO Auto-generated method stub
        System.out.println("abMethod1 메소드 구현");
	}
}
