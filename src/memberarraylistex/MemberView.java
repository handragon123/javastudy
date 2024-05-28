package memberarraylistex;

import java.util.ArrayList;

public class MemberView {

	// MemberDTO 1명 출력
	static void memberPrint(MemberDTO dto) {
		System.out.println("ID: " + dto.getId());
		System.out.println("PW: " + dto.getPw());
		System.out.println("NAME: " + dto.getName());
		System.out.println("AGE: " + dto.getAge());
	}

	// MemberDTO[] 전체 출력
	static void memberPrint(MemberDTO[] members) {		
		for(MemberDTO dto : members) {			
			System.out.println(dto);
		}
	}

	// ArrayList 전체 출력
	static void memberPrint(ArrayList<MemberDTO> members) {		
		for(MemberDTO dto : members) {			
			System.out.println(dto);
		}
	}


}
