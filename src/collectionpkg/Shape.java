package collectionpkg;

public abstract class Shape {
	int x,y;
	
	public Shape() { // 기본생성자
		this(0, 0);
	}
	// 오버로딩생성자
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
		abstract double area();
		abstract double length();
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		@Override
		public String toString() {
			return "Shape [x=" + x + ", y=" + y + "]";
		}
		
		
	
}
