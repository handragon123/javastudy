package classex;

public class InitBlockEx {
	static int staticInt; // static 멤버변수 =0
	int instanceInt; // 인스턴스 맴버변수
	
	// static 초기화블럭이므로 new실행해도 한번만 실행됨
	static {
		System.out.println(staticInt); //0
		staticAction(); 
		System.out.println(staticInt); //1
		staticInt ++; 
		System.out.println(staticInt); //2
		System.out.println("스태이틱 초기화"); 
	}
	// 인스턴스 초기화는 앞에 아무것도 붙지않음
	{ //인스턴스 초기화이므로 new 실행시 계속 실행됨
		staticAction(); 
		System.out.println(staticInt); //3 ,//5
		instanceAction(); 
		System.out.println(staticInt); //4, //6
		instanceInt = staticInt;
		System.out.println("인스턴스 초기화1");
	}
	static  void staticAction () {
		staticInt++;
	}
	 void instanceAction () {
			staticInt++; //=4
		}
	 public InitBlockEx() {
		 System.out.println("InintBlockEx()1");
	 }
	 public static void main(String[] args) {
		 InitBlockEx ib01 = new InitBlockEx(); 
		 InitBlockEx ib02 = new InitBlockEx();
	 }
}
