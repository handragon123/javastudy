package memberarraylistex;

import java.util.ArrayList;
import java.util.Scanner;

public interface MemberService {	
	
	// 회원 목록 전체 불러오는 서비스
	ArrayList<MemberDTO> getMembers();
	
	// 회원 이름 검색 : 1명의 index
	int getNameMember(Scanner sc);
	
	// 회원 정보 입력
	void memberInsert(Scanner sc);
	
	// 회원 정보 수정
	void memberUpdate(Scanner sc);
	
	// 회원 정보 삭제
	void memberDelete(Scanner sc);

	ArrayList<MemberDTO> getNameMembers(Scanner sc);
	
}
