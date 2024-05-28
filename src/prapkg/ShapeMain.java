package prapkg;

public class ShapeMain {

	public static void main(String[] args) {
		
		 Circle circle = new Circle();
	        circle.draw();

	        Point[] p = new Point[3];
	        p[0] = new Point();
	        p[1] = new Point(50, 50);
	        p[2] = new Point(-50, -50);

	        Triangle triangle = new Triangle(p);
	        triangle.draw();
	}

}
