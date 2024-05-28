package inheritancepkg;

// 배열이용
public class Triangle {

	private Point[] p;
	
	public Triangle() {// (0,0) , (2,4) , (4,2)
		p = new Point[3];
		p[0]=new Point(0,0);
		p[1]=new Point(2,4);
		p[2]=new Point(4,2);
	}


	// 오버로딩 생성자
	public Triangle(Point[] p) {
		super();
		this.p = p;
	}



	public Point[] getP() {
		return p;
	}



	public void setP(Point[] p) {
		this.p = p;
	}




	
}
