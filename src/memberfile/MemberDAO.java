package memberfile;

import java.util.List;

public interface MemberDAO {
	// Data Access 실제 전체 회원 목록 가져오기
	List<MemberDTO> getMembers();	

	// id 검색해서 MemberDTO 리턴
	MemberDTO getMember(String id);

	// name 검색해서 MemberDTO 리턴
	MemberDTO getNameMember(String name);

	// name 검색해서 List<MemberDTO> 리턴
	List<MemberDTO> getNameMembers(String name);

	// id 검색해서 index 리턴
	int getIndexId(String id);

	// 회원 목록 입력
	void memberInsert(MemberDTO dto);

	// 회원 정보 수정
	void memberUpdate(MemberDTO dto);

	// 회원 정보 수정
	void memberUpdate(int index, MemberDTO dto);

	// 회원 정보 삭제
	void memberDelete(String id);

	// 회원 정보 삭제
	void memberDelete(int index);
}

