package arrayex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
//		ArrayList 에선 데이터 추가시 data.add 메서드 사용
		data.add("red"); //index 0
		data.add("green"); //index 1
		data.add("blue");
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		for(int i=0;i<data.size();i++) {
//			ArrayList 데이터에서 불러올시 data.get메서드 사용
			System.out.print(data.get(i));
		}
		for(Object o :data) {
			System.out.println(o);
		}
		List<String> sList = new ArrayList<String>();
		sList.add("red");
		sList.add("green");
		sList.add("blue");
	}

}
