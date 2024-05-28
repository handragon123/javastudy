package collectionpkg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=1; i<=5; i++) {
			v.add(i);
		}
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		for(Object o:v) {
			System.out.print(o + " ");
		}
	}

}
