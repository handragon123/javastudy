package genericpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberScanner {
	public static void main(String[] args) {
		// <member>클래스이은 List생성
		List<Member> list = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in); // 키보드 입력값
		for(int i=0; i<3; i++) { // 3번반복하는 문
			System.out.println("name >");
			String name = sc.next();
			System.out.println("id >");
			String id = sc.next();
			System.out.println("password >");
			String password = sc.next();
			System.out.println("age >");
			int age = sc.nextInt();
			
			Member memberi = new Member();
			memberi.setName(name);
			memberi.setId(id);
			memberi.setPassword(password);
			memberi.setAge(age);		
			
			list.add(memberi);
		}		
		// 출력하라 -> memberPrint(list) 출력하라 
		System.out.println("원하는 리스트번호 출력>");
		int i = sc.nextInt()+1;
			Member m = list.get(i);
			String name = m.getName();
			String id = m.getId();
			String password = m.getPassword();
			int age = m.getAge();
			if(i == 1) {
				System.out.printf(" 1번 리스트%s, %s, %s, %s \n", name, id, password, age);
			}
			else if(i == 2) {
				System.out.printf(" 2번 리스트%s, %s, %s, %s \n", name, id, password, age);
			} 
			else  if(i == 3) {
				System.out.printf(" 3번 리스트%s, %s, %s, %s \n", name, id, password, age);
			}
		}
	}






