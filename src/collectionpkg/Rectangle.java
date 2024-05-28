package collectionpkg;

public class Rectangle extends Shape{
	int w,h;
	
	public Rectangle() {
		this(1,1);
	}
	
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	// 추상안쓸거면 오버라이드
	@Override
	double area() {
		return (w*h);
	}

	@Override
	double length() {
		return (w+h)*2;
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
	
}
