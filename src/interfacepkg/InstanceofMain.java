package interfacepkg;

public class InstanceofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O oa = new AAA();
		O oz = new ZZZ();

		A a = new AAA();
		Z z = new ZZZ();

		AA aa = new AAA();
		ZZ zz = new ZZZ(); 

		AAA aaa = new AAA();
		ZZZ zzz = new ZZZ();

		// 모두 object를 상속하기 떄문에 모두 true
		System.out.println(oa instanceof Object);
		System.out.println(aaa instanceof Object);
		System.out.println(zzz instanceof Object);

		// oa 는 AA인데 oz는 AA가아니므로 true, false반환
		System.out.println(oa instanceof AA);
		System.out.println(oa instanceof ZZ);
		// z는 a가 못되므로 false
		System.out.println(z instanceof AA);
		System.out.println(z instanceof ZZ);
	}

}
