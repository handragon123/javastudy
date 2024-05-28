package conditionalex;

public class StaticScopeVar {
	static int i = 10; // 전역 변수
	int j = 100;
	
    public static void main(String[] args) {
        StaticScopeVar ss = new StaticScopeVar(); //ss 로 참조변수 선언
        int rs1 = sAdd(10,20);  // sAdd 는 static함수이므로 부를수있음
        int rs2 = ss.lAdd(100,200); // static이 붙어있지 않아서 new해야지 lAdd를 만들수있음
        System.out.println(rs1);
        System.out.println(rs2);
    }
    
    static int sAdd(int a, int b){ // static 선언으로 static으로 전달가능
    	return a+b;
    }
    int lAdd (int a, int b) { // new선언되어서 ss.lAdd에들어간 (100,200)이들어감
    	return a+b;
    }
    // 결론: static선언이 되지않은 애들은 new 선언해야함
    
}
