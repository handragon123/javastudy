package conditionalex;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 41;
		String rs = ""; //전역변수
		boolean cond1 = score >= 60;
		boolean cond2 = (score % 2) == 0;
		if(cond1){
            if(cond2) {             
                rs = "evenPass";
            }else {
            	rs = "oddPass";            
            }
        }else{
            if(cond2) {             
            	rs = "evenFail";
            }else {
            	rs = "oddFail";            
            }

        }
		System.out.println(rs);
		
	}

}
