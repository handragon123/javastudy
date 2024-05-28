package javaapipkg;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		System.out.println(score);
		
		// 자동형 변환 안댐 String s = score; 
		String s = String.valueOf(score);
		System.out.println(s);
		
		String sum = "";
		for(int i = 1 ; i < 5; i++) {
			sum = sum + i;
//			System.out.println(sum);
		}
		System.out.println(sum);
		
		String text = "Hello world";
		System.out.println(text.charAt(0));
		System.out.println(text.length());
		for(int i=0; i<text.length();i++) {
			System.out.print(text.charAt(i)+" ");
		}
	}

}
