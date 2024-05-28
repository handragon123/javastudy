package abstractvehicle;

public class Car extends Vehicle {
	// 자식에서 부모 추상메서드 꼭 오버라이드 해야함
	@Override
	void move() {
		System.out.println("차도로 다닌다.");
	}
}
