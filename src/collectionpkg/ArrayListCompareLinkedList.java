package collectionpkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCompareLinkedList {

	public static void main(String[] args) {
		List alist = new ArrayList();
		List llist = new LinkedList();
		for(int i=0;i<100000;i++) {
			alist.add(i);
			llist.add(i);
		}
		long start = System.currentTimeMillis();
		for(int i=0;i<alist.size();i++) {
			alist.add(500, i+"");
		}
		long end = System.currentTimeMillis();
		System.out.print(end-start);
		
		start = System.currentTimeMillis();
		for(int i=0;i<alist.size();i++) {
			llist.add(500, i+"");
		}
		end = System.currentTimeMillis();
		System.out.print(end-start);
	}

}
