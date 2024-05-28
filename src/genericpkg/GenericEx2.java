package genericpkg;

public class GenericEx2 {
	public static void main(String[] args) {
		Generic<String> nogen = new Generic<String>();
		
		String[] ss = {"hong","lee","kim"};
		nogen.setV(ss);
		nogen.print();
		
		String[] oArr = nogen.getV();
		for(String s: oArr) {
			System.out.println(s);
		}
		
		Generic<Integer> gen = new Generic<Integer>();
		
		Integer[] ii = {1,2,3};
		gen.setV(ii);
		oArr = nogen.getV();
		for(Object o: oArr) {
			String s = (String) o;
			System.out.println(s);
		}
	}
}









