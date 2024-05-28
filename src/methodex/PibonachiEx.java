package methodex;

public class PibonachiEx {

	public static void main(String[] args) {
		
		int n= 7;
		int rs = pivonachiRecursive(n);
		System.out.println(rs);
		
	}

	private static int pivonachiRecursive(int n) {
		int rs = 0;
		if(n==1 || n==2) {
			rs=1;
		} else if (n>=3) {
			// 앞자리 두개의 숫자 앞하여 대입
			rs = pivonachiRecursive(n-1) + pivonachiRecursive(n-2);
		}
		return rs;
	}

}
