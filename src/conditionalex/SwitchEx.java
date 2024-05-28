package conditionalex;

public class SwitchEx {

    public static void main(String[] args) {
    	
    	String rank = "";
    	int score = 75/10; 
    	
    	
        switch (score) {
		case 9: 
			rank="A";
			break;
		case 8: 
			rank="B";
			break;
		case 7: 
			rank="C";
			break;
		case 6: 
			rank="D";
			break;
		case 5: 
			rank="E";
			break;
		
		default:
			rank = "F";
		}
        System.out.println(rank);
    }

}