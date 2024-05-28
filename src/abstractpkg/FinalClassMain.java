package abstractpkg;

public class FinalClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass fc = new FinalClass();
		fc.abMethod1();
        fc.abMethod2();
        fc.finalMethod();

        AbsClass2 ac2 = new FinalClass();
        ac2.abMethod1();
        ac2.abMethod2();

        AbsClass1 ac1 = new FinalClass(); //다형성이라 사용가능
        ac1.abMethod1(); // 1개 밖에 안보임
       
        FinalClass fc2 = (FinalClass)ac1;
        fc2.abMethod1();
        fc2.abMethod2();
        fc2.finalMethod();   
	}

}
