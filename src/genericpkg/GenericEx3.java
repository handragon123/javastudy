package genericpkg;

public class GenericEx3 {

	public static void main(String[] args) {
		// < > 제네릭 안에 변수형 넣기.
		GenericMap<String, Integer> gen1 = new GenericMap<String, Integer>();
		// SET메소드에 값 대입
		gen1 .set("hong", 1111);
		// 호출
		System.out.println("name =" + gen1.getName() );
		System.out.println("id =" + gen1.getId() );
		
	}

}
