package memberarraylistex;

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
	public void memberDelete(int index) {
		ArrayList<MemberDTO> members = getMembers();
		
		members.remove(index);		
	}

	@Override
	public int getMember(String id) {
		int index = -1;
		// 전체 목록
		ArrayList<MemberDTO> members = getMembers();
		
//		for(int i=0; i<members.size(); i++) {			
//			MemberDTO dto = members.get(i);
//			
//			if(id.equals(dto.getId())) {
//				index = i;
//				break;
//			}
//		}
		
		for(MemberDTO dto : members) {
			index++;
			if(id.equals(dto.getId())){				
				break;
			}
		}
		
		return index;
	}


	public int getNameMember(String name) {
		int index = -1;
		int count = -1;
		// 전체 목록
		ArrayList<MemberDTO> members = getMembers();
		
		for(MemberDTO dto : members) {
			// index++;
			count++;
			if(name.equals(dto.getName())){
				index=count;
				break;
			}
		}
		return index;
	}

	@Override
	public ArrayList<MemberDTO> getNameMembers(String name) {
		// 저장할곳
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		// 전체 부를거
		ArrayList<MemberDTO> members = getMembers();
		for(MemberDTO dto :members) {
			if(name.equals(dto.getName())) {
				dtos.add(dto);
			}
		}
		return members;
	}
}






