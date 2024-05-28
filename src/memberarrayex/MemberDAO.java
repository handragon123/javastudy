package memberarrayex;

import java.util.Scanner;

public interface MemberDAO {
	// Data Access 실제 전체 회원 목록 가져오기
	MemberDTO[] getMembers();
	
	MemberDTO getMember(String id);
	
	// 회원 목록 입력
	void memberInsert(MemberDTO dto);
	
	// 회원 정보 수정
	void memberUpdate(MemberDTO dto);
	
	// 회원 정보 삭제
	void memberDelete(String id);
	
	// 회원 이름으로 검색 서비스 : 1명
	MemberDTO getNameMember(String name);
	
	// 회원 이름으로 검색 서비스 : 전체
	MemberDTO[] getNameMembers(String name);
}
