package classex;

public class PrintLnOverloading {
	
	static void aaa(int i) {
		System.out.println(i);
	}
	static void aaa(int i, int j) {
		System.out.println(i);
	}
	static void aaa(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		aaa("aa");
	}

}
