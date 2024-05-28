package iopkg;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int varByte = -1;
		
		System.out.println("문자입력 >>");
		do {
			try {
				varByte = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			} //1byte 한글 꺠진다
			if(varByte == 10 || varByte == 13){ // Enter 의미 10 커서앞 13 아래로내러감
				break;
			} else {
				System.out.println("read value :" + (char)varByte);
			}
		} while(true);
		System.out.println("end");
	}
}
