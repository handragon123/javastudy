package abstractvehicle;

public class VehicleUseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
        Ship ship = new Ship();
        Plane plane = new Plane();
        VehicleUse vUse = new VehicleUse();
        // 다형성을 이용하여 자식들불러와서 값출력
        vUse.getMoveStyle(car);
        vUse.getMoveStyle(ship);
        vUse.getMoveStyle(plane);       
	}

}
