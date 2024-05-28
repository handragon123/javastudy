package prapkg;
// 하위클래스
public class Triangle extends Shape{
	// (x,y) (y,z) (z,x) 이 점을 이으기위해
	// point (0,0) 3개를 가져와 배열로 만듬
	private Point[] p; // 참조변수 선언
    private int r;

//    오버로딩 생성자 
    public Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
    	Point p1 = this.p[0]; // p1 = p[0]번자리
    	Point p2 = this.p[1]; // p2 = p[1]번자리
    	Point p3 = this.p[2]; // p3 = p[2]번자리
        String s = "Triangle p1(%s) p2(%s) p3(%s) draw!! \n";
        System.out.printf(s, p1.getXY(), p2.getXY(), p3.getXY());
    }
}
