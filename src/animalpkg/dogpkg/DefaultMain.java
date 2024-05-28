package animalpkg.dogpkg;

public class DefaultMain {
	public static void main(String[] args) {
		DefaultDog defaultDog = new DefaultDog(); // default 같은 패키지에서 사용가능
		PublicDog publicDog = new PublicDog(); // 같은패키지 public이라 import필요없음
		
	}
}
