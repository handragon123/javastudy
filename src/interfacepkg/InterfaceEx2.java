package interfacepkg;

// 앞에 class지우고 그냥 인터페이스 넣으면 됨
// interface라하고 
public abstract class InterfaceEx2 {
	//abstract 다 생략
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 10000;

	// 추상메서드
	public abstract double  meanPrice();
	public abstract double  totalPrice();

	// default - 구현에 영향을 주지않음
	abstract double getSalePrice();

	// static 메서드 - 구현에 영향을 주지않음
	static void printPrice(double price) {
		System.out.println(price);
	}
}
