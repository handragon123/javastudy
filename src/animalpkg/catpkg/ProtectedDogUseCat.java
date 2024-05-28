package animalpkg.catpkg;
// 자식클래스
import animalpkg.dogpkg.PublicProtectedDog;

// protected상속해야 사용가능하므로 extends 로상속받아야함
public class ProtectedDogUseCat extends PublicProtectedDog {
    String friendDogName;

    public ProtectedDogUseCat() {
        friendDogName = protectedDogName;
        System.out.println("Protected Cat 및 Dog 1마리 생성");       
        System.out.println("Friend Dog Name : " + friendDogName);       
    }   
}
