package inheritancepkg;

public class AnimalMain extends Object{
	
	static void dogNamePrint(Dog[] dogs) {
		for (int i = 0 ; i<dogs.length;i++) {
			String name = dogs[i].getName();
			System.out.println(name);
		}
		for (Dog dog :dogs) {
			String name = dog.getName();
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		// 생성자 생성
		
		// dog내 기본생성자 지워서 사용못함
//		Dog dog = new Dog();
        Dog dog1 = new Dog("뎅뎅이", 3);
        Dog dog2 = new Dog("바둑이", 1);
        Dog dog3 = new Dog("덕구", 5);
        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogNamePrint(dogs);
        
        Cat cat1 = new Cat("나비", 1);
        Eagle eagle1 = new Eagle("독수리1", 10);
        cat1.move();
        dog1.move();
        eagle1.move();
        System.out.println(cat1.getName());
		
	}

}
