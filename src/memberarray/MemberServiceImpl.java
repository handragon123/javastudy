package memberarray;

import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	// MebeberDAO클래스 불러와서 dao로 초기화
	private MemberDAO dao;
	// 기본 생성자 생성
	public MemberServiceImpl() {
		this.dao = new MemberDAOImpl(); 
	}
	// MemberService 상속이기 때문에 오버라이드해야함
	@Override
	public MemberDTO[] getMembers() {
		return dao.getMembers(); 
	}

	@Override
	public void memberInsert(Scanner sc) {
		System.out.println("id >");
		String id = sc.next();
		System.out.println("pw >");
		String pw = sc.next();
		System.out.println("name >");
		String name = sc.next();
		System.out.println("age >");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, pw, name, age);
		dao.memberInsert(dto);
	}

	@Override
	public void memberUpdate(Scanner sc) {
		System.out.println("Update id >");
		String id = sc.next(); // 5
		// id 존재 여부 체크
		MemberDTO member = dao.getMember(id); // null or MemberDTO
		if(member == null) {
			System.out.println("Member Not Found!!");
		}else {
			System.out.println("Update pw >");
			String pw = sc.next();
			System.out.println("Update name >");
			String name = sc.next();
			System.out.println("Update age >");
			int age = sc.nextInt();
			
			member = new MemberDTO(id, pw, name, age);
			dao.memberUpdate(member);
		}
	}

	@Override
	public void memberDelete(Scanner sc) {
		System.out.println("Delete id >");
		String id = sc.next(); // 5
		// id 존재 여부 체크
		MemberDTO member = dao.getMember(id); // null or MemberDTO
		if(member == null) {
			System.out.println("Member Not Found!!");
		}else {
			dao.memberDelete(id);
		}
	}
}
