package animalpkg;

import animalpkg.dogpkg.PublicDog; //패키지가 달라서 import
import animalpkg.catpkg.ProtectedDogUseCat;

public class AnimalMain {
	public static void main(String[] args) {
		PublicDog publicDog = new PublicDog();
		
		//같은 패키지가 아니라 default를 부르지못함
//		DefaultDog defaultdog = new DefaultDog;
//		protected 가져와서 사용가능
		ProtectedDogUseCat cat = new ProtectedDogUseCat();
	}
}
