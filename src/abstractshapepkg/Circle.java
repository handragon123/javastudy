package abstractshapepkg;

public  class Circle extends Shape {

	int r ;
	public Circle(int r) {
		super("원");
		this.r=r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Shape [type "+ type + ",r=" + r + "]";
	}
	

}
