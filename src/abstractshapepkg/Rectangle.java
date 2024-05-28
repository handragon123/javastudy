package abstractshapepkg;

public class Rectangle extends Shape{
	 int width, height;
	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2* (width + height);
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + ", type=" + type + "]";
	}

}
