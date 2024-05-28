package methodex;

public class MethoArgsEx {
	
	
//	varInt 와 main은 완전 다른 함수이므로 
	// 지역변수도 서로 다르다
//	public static void varInt(int x) {
//		x=10;
//		System.out.println(x);
//	}
//	
//	
//	// 아래 x와 위에 x는 다르다.
//	public static void main(String[] args) {
//		int x = 0;
//		// 복사본을 넣는다. 변화없음
//		varInt(x);
//		System.out.println(x);
//	}
	
	
	public static int varInt(int x) {
		x=10;
		// return값이 있어야 아래로 전달가능.
		return x;
	}
	
	
	// 아래 x와 위에 x는 다르다.
	public static void main(String[] args) {
		int x = 0;
		// 리턴값을받고 아래로 넣는다.
		x = varInt(x);
		System.out.println(x);
	}

}
