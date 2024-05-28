package collectionpkg;

import java.util.List;
import java.util.Vector;



public class VectorEx {
	public static void main(String[] args) {
		List list = new Vector();
		list.add(1.2);//0
		list.add(1.3);//1
		list.add(Math.PI); //2
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		double num = 3.4;
		int index = list.indexOf(num); // = -1 이유 없는숫자라
//		System.out.println(index); 
		if(index == -1) { // -1 이면 num add해라
			list.add(num);
		}
		
		boolean b = list.contains(num); // num 넣는식
//		System.out.println(b); true
		if(b) {
			list.remove(num); //num 삭제
		}
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
