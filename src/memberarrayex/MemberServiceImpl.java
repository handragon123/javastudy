package memberarrayex;

import java.util.Scanner;

public class MemberServiceImpl implements MemberService{

	private MemberDAO dao;
	
	public MemberServiceImpl() {
		this.dao = new MemberDAOImpl(); 
	}
	
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
			
			System.out.println("현재 Pw :" + member.getPw());			
			System.out.println("Update pw >");
			String pw = sc.next();
			
			System.out.println("현재 Name :" + member.getName());
			System.out.println("Update name >");
			String name = sc.next();
			
			System.out.println("현재 Age :" + member.getAge());
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

	@Override
	public MemberDTO getNameMember(Scanner sc) {
		System.out.println("Search Name >");
		String name = sc.next(); // 5
		// name 검색
		MemberDTO member = dao.getNameMember(name);
				
		return member;
	}

	@Override
	public MemberDTO[] getNameMembers(Scanner sc) {
		System.out.println("Search name >");
		String name = sc.next();
		
		MemberDTO[] members =dao.getNameMembers(name);
		return members;
	}
	

}
