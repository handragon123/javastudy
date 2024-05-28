package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = new ArrayList<Member>();        
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
        
		Member member1 = new Member();
		System.out.println("멤버 1의 이름");
		String x1 = sc.nextLine();
		System.out.println("멤버 1의 아이디");
		String x2 = sc.nextLine();
		System.out.println("멤버 1의 비번");
		String x3 = sc.nextLine();
		System.out.println("멤버 1의 나이");
		int i1 = sc2.nextInt();
		
		member1.setName(x1);
		member1.setId(x2);
		member1.setPassword(x3);
		member1.setAge(i1);
		
		list.add(member1);
		
	
		
		System.out.println();
		System.out.println("멤버 2의 이름");
		String x4 = sc.nextLine();
		System.out.println("멤버 2의 아이디");
		String x5 = sc.nextLine();
		System.out.println("멤버 2의 비번");
		String x6 = sc.nextLine();
		System.out.println("멤버 2의 나이");
		int i2 = sc2.nextInt();
		
		Member member2 = new Member();
		member2.setName(x4);
		member2.setId(x5);
		member2.setPassword(x6);
		member2.setAge(i2);
		
		list.add(member2);
	
		System.out.println("멤버 3의 이름");
		String x7 = sc.nextLine();
		System.out.println("멤버 3의 아이디");
		String x8 = sc.nextLine();
		System.out.println("멤버 3의 비번");
		String x9 = sc.nextLine();
		System.out.println("멤버 3의 나이");
		int i3 = sc.nextInt();
		
		Member member3 = new Member();
		member3.setName(x7);
		member3.setId(x8);
		member3.setPassword(x9);
		member3.setAge(i3);
		
		list.add(member3);
		for(Member m : list) {
			String name = m.getName();
			String id = m.getId();
			String password = m.getPassword();
			int age = m.getAge();
			System.out.printf("이름 :%s, 아이디: %s, 비번: %s, 나이: %s \n", name, id, password, age);			
		}
		
		
	}

}
