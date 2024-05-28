package memberfileex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberData {
	
	final static String PATH = "D:/kdigital/data/member.txt";

	public static List<MemberDTO> getMembers() {
		
		FileReader fr = null;
		BufferedReader br = null;
		List<MemberDTO> members = new ArrayList<MemberDTO>();
		
		try {
			fr = new FileReader(PATH);
			br = new BufferedReader(fr);
			while(true) {
				String member = br.readLine();
				if(member == null) break;
				
				String[] arr = member.split(",");
				String id = arr[0];
				String pw = arr[1];
				String name = arr[2];
				int age = Integer.parseInt(arr[3]);
				MemberDTO dto = new MemberDTO(id, pw, name, age);
				members.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return members;
	}	

	public static void setMembers(MemberDTO dto) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String member = "";
		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		int age = dto.getAge();
		member += id;
		member += "," + pw;
		member += "," + name;
		member += "," + age;
		
		try {
			fw = new FileWriter(PATH, true); // true : append
			bw = new BufferedWriter(fw);
			bw.write(member);
			bw.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void setMembers(List<MemberDTO> dtos) {
		FileWriter fw = null;
		BufferedWriter bw = null;		
		
		try {
			fw = new FileWriter(PATH, false); // false : oveawrite
			bw = new BufferedWriter(fw);
			
			for(MemberDTO dto:dtos) {
				String member = "";
				String id = dto.getId();
				String pw = dto.getPw();
				String name = dto.getName();
				int age = dto.getAge();
				member += id;
				member += "," + pw;
				member += "," + name;
				member += "," + age;
				bw.write(member);
				bw.newLine();
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
}
