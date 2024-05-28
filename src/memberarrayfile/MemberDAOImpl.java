package memberarrayfile;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{
	
	@Override
	public ArrayList<MemberDTO> getMembers() {
		// TODO Auto-generated method stub
		return MemberData.members;
	}
	

	@Override
	public void memberInsert(MemberDTO dto) {
		// dto => MemberData.members		
		// 전체 회원
		ArrayList<MemberDTO> members = getMembers(); // members
		
//		arraylist 장점으로 모든 배열 크기 늘리기 삭제 가능
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
		
		// arraylist 장점으로 배열 길이 선언안하고도 가능하다.
		
//		int len = members.length;
//		
//		MemberDTO[] tmp = new MemberDTO[len-1]; // 0,1,2,3
//		
//		int index = 0;	
//		for(int i=0; i<len; i++) {
//			if(id.equals(members[i].getId())) continue; // 0,1
//			else {
//				tmp[index] = members[i]; // 
//				index++;			
//			}
//		}
//		MemberData.members = tmp;
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

	@Override
	public MemberDTO getNameMember(String name) {
		MemberDTO member = null;
		ArrayList<MemberDTO> members = getMembers();
		for(MemberDTO dto : members) {
			if(name.equals(dto.getName())){
				member = dto;
				break;
			}
		}
		
		return member;
	}

	@Override
	public MemberDTO[] getNameMembers(String name) {
		MemberDTO[] dtos = null;
		
		int count = 0;
		ArrayList<MemberDTO> members = getMembers();
		for(MemberDTO dto : members) {
			if(name.equals(dto.getName())){
				count++;
			}
		}
		
		if(count != 0) {
			dtos = new MemberDTO[count];
			int index=0;
			for(int i=0; i<members.size(); i++) {
				MemberDTO m = members.get(i);
				if(name.equals(m.getName())) continue;
				else {
					dtos[index] = m;
					index++;
				}
			}
			
		}
		
		return dtos;
	}

	

}
