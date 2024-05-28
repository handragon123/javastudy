package memberarraylist;

import java.util.ArrayList;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public ArrayList<MemberDTO> getMembers() {
		
		return MemberData.members;
	}

	@Override
	public void memberInsert(MemberDTO dto) {
		// dto => MemberData.members		
		// 전체 회원
		ArrayList<MemberDTO> members = getMembers(); // members
		
		// add()
		MemberData.members.add(dto);
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		// 전체 회원
		ArrayList<MemberDTO> members = getMembers();
//		for(MemberDTO m : members) {
//			if(m.getId().equals(dto.getId())){
//				m.setPw(dto.getPw());
//				m.setName(dto.getName());
//				m.setAge(dto.getAge());
//			}
//		}
		for(int i=0; i<members.size(); i++) {
			MemberDTO m = members.get(i);
			if(dto.getId().equals(m.getId())) {
				m.setPw(dto.getPw());
				m.setName(dto.getName());
				m.setAge(dto.getAge());
			}
		}
	}

	@Override
	public void memberDelete(String id) {
		ArrayList<MemberDTO> members = getMembers();
		
		for(int i=0; i<members.size(); i++) {
			MemberDTO m = members.get(i);
			if(id.equals(m.getId())) {				
				members.remove(i);
			}
		}
		
		
	}

	@Override
	public MemberDTO getMember(String id) {
		MemberDTO member = null;
		ArrayList<MemberDTO> members = getMembers();
		for(MemberDTO dto : members) {
			if(id.equals(dto.getId())){
				member = dto;
				break;
			}
		}
		
		return member;
	}

}
