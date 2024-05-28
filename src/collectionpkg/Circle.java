package collectionpkg;

public class Circle extends Shape{
	
	int r;
	
	public Circle() {
		this(1);
	}
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return (r*r) * Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	

}
