package collectionpkg;

import java.util.ArrayList;
import java.util.List;

import classex.Dog;

public class ListEx3 {
	public static void main(String[] args) {
		List<Dog> list = new ArrayList<Dog>();// 10개
		// add(Object o)
		Dog dog = new Dog();		 
		list.add(dog); 
		list.add(new Dog());
		
		// get(index)
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for(Dog d : list) {
			//int i = (int)o;
			System.out.print(d + " ");
		}
		
		
		
	}
}
