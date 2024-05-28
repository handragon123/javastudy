package memberarray;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public MemberDTO[] getMembers() {
		
		return MemberData.members;
	}

	@Override
	public void memberInsert(MemberDTO dto) {
		// dto => MemberData.members		
		// 전체 회원
		MemberDTO[] members = getMembers(); // members
		
		// 전체 회원 수
		int len = members.length; // 2
		
		// 배열 늘리기
		MemberDTO[] tmp = new MemberDTO[len+1]; // 3
		
		// 기존 회원 복사
		for(int i=0; i<len; i++) {
			tmp[i] = members[i];
		}
		tmp[len] = dto;
		
		// MemberData 참조 주소 변경 
		MemberData.members = tmp;
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		// 전체 회원
		MemberDTO[] members = getMembers();
//		for(MemberDTO m : members) {
//			if(m.getId().equals(dto.getId())){
//				m.setPw(dto.getPw());
//				m.setName(dto.getName());
//				m.setAge(dto.getAge());
//			}
//		}
		for(int i=0; i<members.length; i++) {
			if(dto.getId().equals(members[i].getId())) {
				members[i] = dto;
			}
		}
	}

	@Override
	public void memberDelete(String id) {
		MemberDTO[] members = getMembers();
		int len = members.length;
		MemberDTO[] tmp = new MemberDTO[len-1]; // 0,1,2,3
		int index = 0;	
		for(int i=0; i<len; i++) {
			if(id.equals(members[i].getId())) // index값과 id값이 같으면
				continue; 
			else {
				tmp[index] = members[i]; // 
				index++;			
			}
		}
		// 삭제후 tmp에 값저장
		MemberData.members=tmp;
	}
	@Override
	public MemberDTO getMember(String id) {
		MemberDTO member = null;
		MemberDTO[] members = getMembers();
		for(MemberDTO dto : members) {
			if(id.equals(dto.getId())){
				member = dto;
				break;
			}
		}
		return member;
	}

}
