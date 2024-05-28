package memberfileex;

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
	public void memberInsert(MemberDTO dto) {
		dao.memberInsert(dto);
	}

	@Override
	public void memberUpdate(int index, MemberDTO dto) {
			dao.memberUpdate(index, dto);
	}

	@Override
	public void memberDelete(int index) {
		dao.memberDelete(index);
	}

	@Override
	public MemberDTO getNameMember(String name) {

		return dao.getNameMember(name);
	}
	
	@Override
	public List<MemberDTO> getNameMembers(String name) {
		return dao.getNameMembers(name);
	}

}
