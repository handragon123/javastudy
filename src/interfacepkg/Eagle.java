package interfacepkg;

public class Eagle implements Animal {

	// 부모 오버라이드
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잠을 잔다");
	}
	// 내꺼 생성
	public void eat () {
		System.out.println("먹는다");
	}
}
