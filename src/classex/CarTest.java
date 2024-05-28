package classex;

import java.util.Arrays;

public class CarTest {

	public static void main(String[] args) {
		// 클래스 인스턴스 생성
		Car car1 = new Car();
		car1.color = "pink";
		car1.company = "현대";
		car1.go();
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		car2.company = "기아";
		car2.back();
		
		Car[] cars = new Car[2];
		cars[0] = car1;
		cars[1] = car2;
		
		for(Car c :cars) {
			System.out.println(c.color);
		}
	}
}
