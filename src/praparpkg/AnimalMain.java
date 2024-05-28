package praparpkg;

public class AnimalMain {

	 public static void main(String[] args) {
		 Dog dog1 = new Dog("뎅뎅이", 3);
		 dog1.move();
		 System.out.println(dog1.getName());
	     Cat cat1 = new Cat("나비", 1);
	     cat1.move();
	     Eagles eagle1 = new Eagles("독수리", 2);
	     eagle1.move();
	    }

}
