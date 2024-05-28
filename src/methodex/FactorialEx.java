package methodex;

public class FactorialEx {
		// factorialFor 함수 선언
		static int factorialFor(int n) {
	        int rs = 1;
	        for(int i=n; i>0; i--) {
	            rs = rs * i;
	        }
	        return rs;
	    }

	    // recursive 함수 선언
	    static int fcatorialRecursive(int n) {
	        int rs = 0;
	        if(n == 1 || n == 0) rs = 1; // 1! or 0! == 1
	        else if(n > 0) {
	        	//재귀함수 자신의 값을 계속대입
	            rs = n * fcatorialRecursive(n-1);
	        }
	        return rs;
	    }
	    
	    public static void main(String[] args) {
	        int n = 5; // n=5
	        int rs1 = factorialFor(n);
	        int rs2 = fcatorialRecursive(n);
	        System.out.println(rs1);
	        System.out.println(rs2);
	    }
}
