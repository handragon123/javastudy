package javaapipkg;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		int i3 = 10; // 기본형 변수
		
		System.out.println(i1 == i2);
		System.out.println(i1 .equals(i2));
		System.out.println(i1 == 10);
		System.out.println(i1 == i3); // 같은 기본형 변수라 true
		
		System.out.println(Integer.MIN_VALUE); 
		System.out.println(Integer.MAX_VALUE); 
	}
}
