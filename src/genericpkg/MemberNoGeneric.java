package genericpkg;

import java.util.ArrayList;
import java.util.List;

public class MemberNoGeneric {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setId("hong");
		member1.setPassword("1111");
		member1.setAge(11);
		
		Member member2 = new Member();
		member2.setName("홍길동2");
		member2.setId("hong2");
		member2.setPassword("2222");
		member2.setAge(22);
		
		list.add(member1);
		list.add(member2);
		
		for(int i=0; i<list.size(); i++) {
			Object o = list.get(i);
			Member m = (Member)o;
			String name = ((Member)o).getName();
			String id = ((Member)list.get(i)).getId();
			String password = m.getPassword();
			int age = m.getAge();
			System.out.printf("%s, %s, %s, %s \n", name, id, password, age);
			
		}
		
		
	}
}






