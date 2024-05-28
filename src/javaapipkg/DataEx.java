package javaapipkg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		// 출력값 포멧
		SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss"); 
		System.out.println(sf.format(now));
		// calendar 클래스
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		System.out.println(sf.format(d));
		
		System.out.println("일자 :" + cal.get(Calendar.DATE));
		// 몇월달인지 구하는 함수
		int month = cal.get(Calendar.MONTH)+1; //1월=0으로 시작
		System.out.println(month);
		// 오늘 무슨요일인지 구하는 함수
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] sDay = {"토", "일", "월", "화", "수", "목", "금"};
		System.out.println(sDay[day]);
	}

}
