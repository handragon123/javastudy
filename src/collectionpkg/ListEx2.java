package collectionpkg;

import java.util.ArrayList;
import java.util.List;

import classex.Dog;

public class ListEx2 {
	public static void main(String[] args) {
		List list = new ArrayList();// 10개
		// add(Object o)
		Dog dog = new Dog();
		list.add(1); 
		list.add("2"); 
		list.add(3); 
		list.add("4"); 
		list.add(dog); 
		
		// get(index)
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for(Object o : list) {
			//int i = (int)o;
			System.out.print(o + " ");
		}
		
		
		
	}
}
