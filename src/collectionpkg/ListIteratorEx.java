package collectionpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i=1; i<6; i++) {
			list.add(i);
		}
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.print(lit.next()+ " ");
		}
		System.out.println();
		// 역순
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+ " ");
		}
	}

}
