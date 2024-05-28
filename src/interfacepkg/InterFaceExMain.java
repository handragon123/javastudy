package interfacepkg;

public class InterFaceExMain {

	public static void main(String[] args) {
		// 참조변수.static()
		InterfaceEx.printPrice(0); // price값 출력

		InterfaceExImpl ie = new InterfaceExImpl();
		// default
		ie.getSalePrice(0);
		System.out.println(ie.getSalePrice(0));
		
		ie.meanPrice(); // impl method
		ie.totalPrice(); // impl mehod
	}

}
