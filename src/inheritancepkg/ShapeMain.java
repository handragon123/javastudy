package inheritancepkg;

import java.util.Arrays;

public class ShapeMain {
	
	

	public static void main(String[] args) {
		// i) 생성자기본값에 초기값주고 한번에 호출
		Circle circle = new Circle();
		System.out.printf("x좌표 %s%n",circle.getX()); //x
		System.out.println(circle.getY()); //y
		System.out.println(circle.getR()); //r
		System.out.println(circle.getColor()); //get으로 함수 호출
		circle.draw();
		
	
		// ii) 생성자 초기값안주고 여기서 값 대입한 경우
		Circle circle1 = new Circle(1,5,6,"red");
		System.out.printf("%n%nx좌표 %s%n",circle1.getX()); //x
		System.out.println(circle1.getY()); //y
		System.out.println(circle1.getR()); //r
		System.out.println(circle1.getColor()); // get으로 함수 호출
		circle.draw();
		System.out.println(" ");
		System.out.println(" ");
		
		Circle2 circle2 = new Circle2();
		System.out.println(circle2.getCenter().getX());
		System.out.println(circle2.getCenter().getY());
		System.out.println(circle2.getR());
		
		
		
		
		
		Triangle triangle = new Triangle();
        Point[] points = triangle.getP();
        for (Point p : points) {
        	System.out.printf("(%s,%s)" , p.getX(), p.getY());
        }
        
        Point[] p = new Point[3];
        Point point1 = new Point(0,0);
        Point point2 = new Point(2,4);
        Point point3 = new Point(4,2);
        
       
        System.out.printf("(%s,%s)" ,point1.getX(), point1.getY());
        System.out.printf("(%s,%s)" ,point2.getX(), point2.getY());
        System.out.printf("(%s,%s)" ,point3.getX(), point3.getY());


		
	}

}
