package abstractshapepkg;

public class ShapeMain {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);

		for(Shape s: shapes) {
			System.out.println(s);
			System.out.printf("area:%s, length:%s", s.area(), s.length());
		}
	}
}
