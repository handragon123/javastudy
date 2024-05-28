package genericpkg;

public class NoGeneric {
	Object[] v;

	public Object[] getV() {
		return v;
	}

	public void setV(Object[] v) {
		this.v = v;
	}
	
	void print() {
		for(Object o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
