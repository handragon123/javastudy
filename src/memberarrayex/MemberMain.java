package memberarrayex;

import java.util.Arrays;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		String[] menus = {
				"1. 회원 가입 create",
				"2. 회원 목록 보기 read(view)",
				"3. 회원 정보 수정 : id 일치 1명",
				"4. 회원 정보 삭제 : id 일치 1명",
				"5. 회원 정보 이름 검색 : name 일치 1명",
				"6. 회원 정보 이름 검색 : name 일치 1명",
				"9. 끝내기"				
		};			
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		// service
		MemberService service = new MemberServiceImpl();
		
		while(true) {
			for(String m : menus) {				
				System.out.println(m);				
			}
			// menu 번호
			int command = sc.nextInt();
			if(command == 1) {
				// create - insert
				service.memberInsert(sc);
			}else if(command == 2) {
				// read - select
				MemberDTO[] members = service.getMembers();
				MemberView.memberPrint(members);
			}else if(command == 3) {
				// update - update
				service.memberUpdate(sc);
			}else if(command == 4) {
				// delete - delete
				service.memberDelete(sc);
			}else if(command == 5) {				
				MemberDTO member = service.getNameMember(sc);
				if(member == null) {
					System.out.println("Member Not Found!!");
				}else {
					MemberView.memberPrint(member);
				}
				
			}else if(command == 6) {				
				MemberDTO[] members = service.getNameMembers(sc);
				if(members == null) {
					System.out.println("Member Not Found!!");
				}else {
					MemberView.memberPrint(members);
				}
				
			}else if(command == 9) {
				System.out.println("Bye~~");
				break;
			}
		}
		
		
	}
}
