package classex;

public class MyMultiplyMain {
	public static void main(String[] args) {
		MyMultiply mm = new MyMultiply();
		
		int rs = mm.multiply(10, 10);
		System.out.println(rs);
		
		double drs = mm.multiply(10.0, 5.0);
		System.out.println(drs);
		
		double drs2 = mm.multiply(10.0, 10);
		System.out.println(drs2);
		
		double drs3 = mm.multiply(10, 10.0);
		System.out.println(drs3);
	}

	
	
}
