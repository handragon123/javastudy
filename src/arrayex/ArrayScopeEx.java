package arrayex;

public class ArrayScopeEx {
	
	static void arrayScope(int x, int[] arr) {
		System.out.println(x);
		System.out.println(arr[0]);
		
		x=10;
		arr[0]=10;
		
		System.out.println(x);
		System.out.println(arr[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int[] arr = new int[1];
		arr[0] = 5;
		arrayScope(x, arr);
		
		System.out.println(x);
		System.out.println(arr[0]);
	}

}
