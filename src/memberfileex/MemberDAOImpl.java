package memberfileex;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public List<MemberDTO> getMembers() {
		
		return MemberData.getMembers();
	}

	@Override
	public void memberInsert(MemberDTO dto) {
		
		MemberData.setMembers(dto);
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		// 전체 회원
		List<MemberDTO> members = getMembers();
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
				m.setEmail(dto.getEmail());
			}
		}
	}

	@Override
	public void memberDelete(String id) {
		List<MemberDTO> members = getMembers();
		
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
		List<MemberDTO> members = getMembers();
		for(MemberDTO dto : members) {
			if(id.equals(dto.getId())){
				member = dto;
				break;
			}
		}
		
		return member;
	}
	
	@Override
	public MemberDTO getNameMember(String name) {
		MemberDTO member = null;
		List<MemberDTO> members = getMembers();
		for(MemberDTO dto : members) {
			if(name.equals(dto.getName())){
				member = dto;
				break;
			}
		}
		
		return member;
	}
	
	@Override
	public List<MemberDTO> getNameMembers(String name) {
		List<MemberDTO> members = getMembers();
		List<MemberDTO> rs = new ArrayList<MemberDTO>();
		for(MemberDTO dto : members) {
			if(name.equals(dto.getName())){
				rs.add(dto);
			}
		}		
		return rs;
	}

	@Override
	public int getIndexId(String id) {
		int index = -1;
		List<MemberDTO> members = getMembers();
		for(int i=0; i<members.size(); i++) {
			if(id.equals(members.get(i).getId())){
				index = i;
				break;
			}
		}
		return index;
	}

	@Override
	public void memberUpdate(int index, MemberDTO dto) {
		
		List<MemberDTO> members = getMembers();
		members.set(index, dto);
		
		MemberData.setMembers(members);
	}

	@Override
	public void memberDelete(int index) {
		List<MemberDTO> members = getMembers();
		members.remove(index);
		
		MemberData.setMembers(members);
	}

}




