package memberarraylistex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{

	private MemberDAO dao;
	
	public MemberServiceImpl() {
		this.dao = new MemberDAOImpl(); 
	}
	
	@Override
	public ArrayList<MemberDTO> getMembers() {
		
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
		int index = dao.getMember(id); // -1 or index
		if(index == -1) {
			System.out.println("Member Not Found!!");
		}else {
			System.out.println("Update pw >");
			String pw = sc.next();
			System.out.println("Update name >");
			String name = sc.next();
			System.out.println("Update age >");
			int age = sc.nextInt();
			
			MemberDTO member = new MemberDTO(id, pw, name, age);
			dao.memberUpdate(member);
		}
	}

	@Override
	public void memberDelete(Scanner sc) {
		System.out.println("Delete id >");
		String id = sc.next(); // 5
		// id 존재 여부 체크
		int index = dao.getMember(id); // null or MemberDTO
		if(index == -1) {
			System.out.println("Member Not Found!!");
		}else {
			dao.memberDelete(index);
		}
	}

	@Override
	public int getNameMember(Scanner sc) {
		
		System.out.println("Search Name >");
		String name = sc.next(); // 5
		int index = dao.getNameMember(name);
		
		return index;
	}

	@Override
	public ArrayList<MemberDTO> getNameMembers(Scanner sc) {
		System.out.println("Search Name >");
		String name = sc.next(); // 5
		ArrayList<MemberDTO> members = dao.getNameMembers(name);
		
		return dao.getNameMembers(name);
	}
	
	

}










