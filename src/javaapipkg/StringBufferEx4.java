package javaapipkg;

public class StringBufferEx4 {

	public static void main(String[] args) {
	long start = System.currentTimeMillis();
	System.out.println(start);
	
	String str = " ";
	for(int i = 0; i<1000000; i++) {
		str += 1;
	}
	long end = System.currentTimeMillis();
	System.out.println("실행시간: " +(end-start) / 1000);
	}

}
