package memberarrayex;

import java.util.Scanner;

public interface MemberService {	
	
	// 회원 목록 전체 불러오는 서비스
	MemberDTO[] getMembers();
	
	// 회원 정보 입력
	void memberInsert(Scanner sc);
	
	// 회원 정보 수정
	void memberUpdate(Scanner sc);
	
	// 회원 정보 삭제
	void memberDelete(Scanner sc);
	
	// 회원 이름으로 검색 서비스 : 1명
	MemberDTO getNameMember(Scanner sc);
	
	// 회원 이름으로 검색 서비스 : 1명
	MemberDTO[] getNameMembers(Scanner sc);
	
}
