package methodex;

// 자바 가상머신은 static먼저 확인함
// static -> Mymath -> si -> add
public class Mymath {
	// 클래스안에서는 (변수, 메소드) 만 사용할수있다.
	// sysout는 메소드를 콜하는 함수라 class내에서 사용할수없다.
	// 변수 =  정적
	// method = 동적.
	static int sI = 10; // 변수선언 가능
	int i = 100; //변수선언 가능
	//static
	// 메서드 선언 가능
	static int sAdd(int x) {
		int y = x + x; //메소드들의 지역변수
		return y;
	}
	//instance
	//메서드 선언가능
	int add(int a , int b) {
		int y = a + b;
		return y;
	}
	// 호출함수이므로 사용할수없다.
	// system.out.println();

	public static void main(String[] args) {
		// main함수가 사용할수있는함수.
		// 위에 클래스를 새로 하나 만들어줌
		// static 선언한부분은 그냥 불러서 쓰면됨
		//		System.out.println(add(10)); // static없어서 선언불가.
		System.out.println(sI); //sI의 값 10 호출
		int y = sAdd(sI); // sAdd sI의 값 10넣기
		System.out.println(y); // 10넘고 계산값 호출

		//instance부분은 new로 한번더 만들어서 써야함
		// 만들어진 Mymath클래스를 instanc가져오면 여기다가 new로 선언
		Mymath math = new Mymath();
		System.out.println(math.i);
		y = math.add(math.i ,  sI);
		System.out.println(y);

	}

}
