package conditionalex;

public class IfEx {

	public static void main(String[] args) {
		int score = 60;
		String rs = ""; //전역변수
		boolean cond = score >= 60;
		if (cond) {
			rs = "score >= 60 Pass!!";
		}
		if (cond) {
			rs = "score < 60 Fail!!";
		}
		System.out.println(rs);
		
	}

}
