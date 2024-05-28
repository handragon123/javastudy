package abstractshapepkg;

public abstract class Shape {
	String type;
	// 오버로딩
	public Shape(String type) {
		super();
		this.type = type;
	}
	
	abstract double area();
	abstract double length();
}
