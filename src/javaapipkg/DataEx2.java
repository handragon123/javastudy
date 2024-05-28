package javaapipkg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEx2 {
	// 두 날짜간 일수 구하기
	public static void main(String[] args) {
		// 현재
		int sYear = 2024;
		int sMonth = 3;
		int sDay = 25;
		
		// 과거
		int eYear = 2000;
		int eMonth = 1;
		int eDay = 28; 
		// 생성자 생성
		Date sd = new Date(sYear, sMonth-1, sDay);
		Date ed = new Date(eYear, eMonth-1, eDay);
		// 현재 - 과거
		long temp = (sd.getTime() - ed.getTime());
		System.out.println(temp/(1000*60*60*24));  //1000=밀리초 60초 분 시간
		
//		System.out.println(sd.getTime());
//		System.out.println(ed.getTime());
	}

}
