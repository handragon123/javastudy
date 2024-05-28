package memberfile;

import java.util.List;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{

	private MemberDAO dao;

	public MemberServiceImpl() {
		this.dao = new MemberDAOImpl(); 
	}

	@Override
	public List<MemberDTO> getMembers() {

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
		int index = dao.getIndexId(id); // -1 or index		

		if(index == -1) {
			System.out.println("Member Not Found!!");
		}else {
			// 방법 1 전체에서 index
			//List<MemberDTO> members = dao.getMembers();
			//MemberDTO member = members.get(index);

			// 방법 2 id 검색해서 MemberDTO			
			MemberDTO member = dao.getMember(id);

			System.out.println("기존 pw > " + member.getPw());
			System.out.println("Update pw >");
			String pw = sc.next();

			System.out.println("기존 name > " + member.getName());
			System.out.println("Update name >");
			String name = sc.next();

			System.out.println("기존 age > " + member.getAge());
			System.out.println("Update age >");
			int age = sc.nextInt();

			member  = new MemberDTO(id, pw, name, age);
			dao.memberUpdate(index, member);
		}
	}

	@Override
	public void memberDelete(Scanner sc) {
		System.out.println("Delete id >");
		String id = sc.next(); // 5
		// id 존재 여부 체크
		int index = dao.getIndexId(id); // -1 or index
		if(index == -1) {
			System.out.println("Member Not Found!!");
		}else {
			dao.memberDelete(index);
		}
	}

	@Override
	public MemberDTO getNameMember(Scanner sc) {
		System.out.println("Search Name >");
		String name = sc.next(); // 5

		// Name 존재 여부 체크
		MemberDTO member = dao.getNameMember(name); // null or dto		

		return member;
	}
	
	@Override
	public List<MemberDTO> getNameMembers(Scanner sc) {
		System.out.println("Search Name >");
		String name = sc.next(); // 5

		// Name 존재 여부 체크
		List<MemberDTO> members = dao.getNameMembers(name); // null or dto		

		return members;
	}

}
