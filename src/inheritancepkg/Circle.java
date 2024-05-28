package inheritancepkg;
// 3개 변수이용
public class Circle extends Shape{
	// 맴버변수, 데이터 필드
//	int x;  로 할수있으나 직접접근이안외므로 private사용한후. get,set메서드 생성
	private int x; //원점의 x좌표
	private int y; //원점의 y좌표
	private int r; // 반지름
	private String color; //1
	// 참조변수와 메서드 실행하기위해서 생성자 생성후 값 대입
	// 생성자 = 나의 클래스와 동일한 이름을 가진 메서드 
	// 생성자 목적 = 맴버변수 초기화 = 초기에 this안에 값을 넣어줌
	// i)
	public Circle() {
//		this.x = 0; // 생성자에 변수처럼 값 대입
//		this.y = 0;
//		this.r = 5;
//		this.color = "red"; //2
		this(0,0,5,"red"); // this.와 같은 기능이지만 더짧다
	} // 다른곳에서 new Circle2() 호출시 이 생성자 호출
	
	// 생성자 내에서 초기값이 없는 생성자
	// ii) 오버로딩 생성자
	public Circle(int x, int y, int r, String color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}


	// 맴버 메서드
	void draw () {
		System.out.printf("Circle2 center(%s,%s) radius(%s) draw!",this.x,this.y,this.r);
	}

	// private접근하기위해 getter, setter생성
	// set은 데이터 보내는기능
	// get은 데이터 받는기능
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	// 3값대입
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
