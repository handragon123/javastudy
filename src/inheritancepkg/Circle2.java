package inheritancepkg;
// 2개변수인데 1개는 point 
public class Circle2 extends Shape{
	private Point center; // Point값 들어가면 x,y에 (0,0)이 들어있다.
	private int r;
	
	
	public Circle2() {
//		this.center = new Point(5,5);
//		this.r = 5;
		this(new Point(5,5), 5);
	}
	
	public Circle2(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}


	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	
	
}
