package inheritancepkg;
// final 상속못함
public class FinalAnimal extends Animal {
	final int WINGS_NUM = 2;
	final int LEGS_NUM = 4;
	final int EYES_NUM = 8;

	public FinalAnimal(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public final void move() {
		super.move();
	}
	
	
	public void calc () {
		int r = 20;
		double area = 20 * UtilEx.PI * UtilEx.PI;
	}
	
	
	
}
