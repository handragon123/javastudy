package methodex;

// 자바 가상머신은 static먼저 확인함
// static -> Mymath -> si -> add
public class Mymath2 {
	// 클래스안에서는 (변수, 메소드) 만 사용할수있다.
	// sysout는 메소드를 콜하는 함수라 class내에서 사용할수없다.

	// 변수 =  정적
	// method = 동적.

	static int sI = 10; // 변수선언 가능
	int i = 100; //변수선언 가능

	//static
	static int sAdd(int x) {
		int y = x + x; //메소드들의 지역변수
		return y;
	}
	//instance
	int add(int a , int b) {
		int y = a + b;
		return y;
	}
}
