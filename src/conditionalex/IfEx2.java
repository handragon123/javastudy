package conditionalex;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 60;
		String rs = ""; //전역변수
		boolean cond1 = score >= 60;
		boolean cond2 = (score % 2) == 0;
		if (cond1 && cond2) {
			rs = "score >= 60 Pass!!";
		} else {
			rs = "score < 60 Fail!!";
		}
		System.out.println(rs);
		
	}

}
