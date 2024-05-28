package genericpkg;

public class GenericEx {
	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"hong","lee","kim"};
		nogen.setV(ss);
		nogen.print();
		
		Object[] oArr = nogen.getV();
		for(Object o: oArr) {
			String s = (String) o;
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		nogen.setV(ii);
		oArr = nogen.getV();
		for(Object o: oArr) {
			String s = (String) o;
			System.out.println(s);
		}
	}
}









