package genericpkg;

public class Generic<T> {
	T[] v;

	public T[] getV() {
		return v;
	}

	public void setV(T[] v) {
		this.v = v;
	}
	
	void print() {
		for(T o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
