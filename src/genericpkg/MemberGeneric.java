package genericpkg;

import java.util.ArrayList;
import java.util.List;

public class MemberGeneric {
	public static void main(String[] args) {
		// < > 제네릭 사용하여 ArrayList 생성
		List<Member> list = new ArrayList<Member>();
		// Member클래스 생성
		Member member1 = new Member(); // Member변수 set불러와서 대입
		member1.setName("홍길동");
		member1.setId("hong");
		member1.setPassword("1111");
		member1.setAge(11);
		// Member클래스 생성
		Member member2 = new Member();
		member2.setName("홍길동2");
		member2.setId("hong2");
		member2.setPassword("2222");
		member2.setAge(22);
		// 생성된 클래스 list에 추가
		list.add(member1);
		list.add(member2);
		// list 반복문만들기
		for(Member m : list) { // set변수 get하여 list에 대입
			String name = m.getName();
			String id = m.getId();
			String password = m.getPassword();
			int age = m.getAge();
			System.out.printf("%s, %s, %s, %s \n", name, id, password, age);			
		}
		
	}
}






