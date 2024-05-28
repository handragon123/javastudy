package interfacepkg;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Eagle();
		animal.sleep();
		// 형변환식
		Eagle eagle = (Eagle)animal;
		// eagle만 eat있어서 형변환 해줘야함 
		eagle.eat();
	}
}
