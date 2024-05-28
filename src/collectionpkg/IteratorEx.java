package collectionpkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
	public static void main(String[] args) {
		
		Iterator it = null;
		
		List list = new ArrayList();
		Set set = new HashSet();
		
		for(int i=1; i<6; i++) {
			list.add(i);
			set.add(i);
		}
		
		it = list.iterator();
		iteratorPrint(it);
		
		it = set.iterator();
		iteratorPrint(it);
		
	}
	
	public static void iteratorPrint(Iterator it) {
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(); 
	}
}




