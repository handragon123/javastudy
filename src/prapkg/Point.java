package prapkg;
// 포함 클래스이므로 extends 하지않음
public class Point {
	private int x;
	private int y;  
	// 오버로딩 생성자
	public Point (int x, int y) {
		this.x = y;
		this.y = x;
	}
	// Point 0,0 으로 초기화
	public Point() {
		this(0,0);
	}
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
	public String getXY() {
        return String.format("%s,%s", this.x, this.y);
    }  

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }   
	

}
