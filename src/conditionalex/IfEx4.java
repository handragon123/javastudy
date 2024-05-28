package conditionalex;

public class IfEx4 {

	public static void main(String[] args) {
		int score = 82;
		String rank = ""; 
		if(score >= 95) {
			rank="A+";
		} else if (score >=90){
			rank="A";
		}
		else if (score >=85){
			rank="B+";
		}
		else if (score >=80){
			rank="B";
		}
		else if (score >=75){
			rank="C+";
		}
		else if (score >=70){
			rank="C";
		}
		else if (score >=65){
			rank="D+";
		}
		else if (score >=60){
			rank="D";
		}
		else {
			rank="F";
		}
		System.out.println(rank);
		
	}

}
