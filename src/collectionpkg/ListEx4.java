package collectionpkg;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class ListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> list = new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Circle(5));
		list.add(new Rectangle());
		list.add(new Rectangle(5,5));
		
//		for(Shape shape : list) {
//			System.out.println(shape.area());
//			System.out.println(shape.length());
//		}
		
		System.out.println("areasum:" + sumArea(list));
		System.out.println("areasum:" + sumLength(list));
	}

	private static double sumLength(List<Shape> list) {
		double rs = 0;
		for(Shape shape : list) {
			rs = rs + shape.area();
//			System.out.println(shape.area());
		}
		return rs;
	}

	private static double sumArea(List<Shape> list) {
		double rs = 0;
		for(Shape shape : list) {
			rs = rs + shape.length();
//			System.out.println(shape.area());
		}
		return rs;
	}

}
