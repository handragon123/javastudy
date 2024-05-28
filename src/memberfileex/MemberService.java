package memberfileex;

import java.util.List;
import java.util.Scanner;

public interface MemberService {	
	
	// 회원 목록 전체 불러오는 서비스
	List<MemberDTO> getMembers();	
	
	// 회원 Name 검색 : 1명
	MemberDTO getNameMember(String name);	
	
	// 회원 Name 검색 : 전체
	List<MemberDTO> getNameMembers(String name);
	
	// 회원 정보 입력
	void memberInsert(MemberDTO dto);
	
	// 회원 정보 수정
	void memberUpdate(int index,MemberDTO dto);
	
	// 회원 정보 삭제
	void memberDelete(int index);
	
}
