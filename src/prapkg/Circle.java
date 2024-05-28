package prapkg;

public class Circle extends Shape {
	//	Point 클래스 재사용
	private Point center;
	private int r;

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle() {
		this(new Point(), 50);
	}

	void draw() {
		String s = "Circle center(%s) radius(%s) draw!! \n";
		System.out.printf(s, center.getXY(), this.r);
	}
}
