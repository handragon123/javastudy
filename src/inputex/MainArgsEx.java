package inputex;

public class MainArgsEx {

	public static void main(String[] args) {
		
		String args1 = args [0];
		String args2 = args [1];
		int i1 = Integer.parseInt(args1);
		int i2 = Integer.parseInt(args2);
		int rs = i1 + i2;
		
		System.out.println(args1);
		System.out.println(args2);
		System.out.println(rs);
	}

}
