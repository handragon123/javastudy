package memberarraylistex;

import java.util.ArrayList;
import java.util.Scanner;

public interface MemberDAO {
	// Data Access 실제 전체 회원 목록 가져오기
	ArrayList<MemberDTO> getMembers();
	
	int getMember(String id);
	
	// 회원 이름 검색 : 1명의 index
	int getNameMember(String name);
	
	// 회원 목록 입력
	void memberInsert(MemberDTO dto);
	
	// 회원 정보 수정
	void memberUpdate(MemberDTO dto);
	
	// 회원 정보 삭제(id)
	void memberDelete(String id);
	
	// 회원 정보 삭제(index)
	void memberDelete(int index);

	ArrayList<MemberDTO> getNameMembers(String name);
}
