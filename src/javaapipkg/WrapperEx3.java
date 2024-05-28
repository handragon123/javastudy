package javaapipkg;

public class WrapperEx3 {
	String number = "100";
	int i1 = Integer.parseInt(number);
	
	int i2 = new Integer(number).intValue();
	int i3 = Integer.valueOf(number); // value는 확장
	
	
}
