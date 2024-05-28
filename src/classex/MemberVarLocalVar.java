package classex;

public class MemberVarLocalVar {
	// 맴버변수 new필요 (인스턴스변수)
	int memInt ; 
	String memString;
	// 클래스변수 
	static int staticInt;
	static String staticString;
	
	public static void main(String[] args) {
		
		// 지역변수 초기화 후 사용
		int localInt = 0;
		String localString = null;
		System.out.printf("Local Var: %s, %s%n",localInt, localString);
		// 맴버변수 초기화
		MemberVarLocalVar m = new MemberVarLocalVar() ;
		
		// 자동 초기화
		System.out.printf("Member Var: %s, %s%n",m.memInt, m.memString);
		System.out.printf("Member Var: %s, %s%n",staticInt, staticString);
	}

}
