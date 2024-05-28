package javaapipkg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEx3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 2, 25);
		Date day = cal.getTime();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		sdf2 = new SimpleDateFormat("yy-mm-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.sss");
		sdf4 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss a");
		System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day)) ;
        System.out.println(sdf4.format(day));
	}

}
