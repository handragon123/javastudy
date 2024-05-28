package memberdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO{

	// connection
	Connection getConnection() {
		Connection conn = null;

		try {
			// 1. driver loading
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);

			// 2. connection -> 사용할 db database name : world 에 주의
			String url = "jdbc:mysql://localhost:3306/kdigital?serverTimezone=UTC";
			String user = "root";
			String password = "rpass";
			conn =  DriverManager.getConnection(url, user, password);

			System.out.println("conn ok!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;		
	}	

	// close : select
	void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// close : insert , update, delete
	void close(PreparedStatement pstmt, Connection conn) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// select all
	public List<MemberDTO> getMembers() {
		List<MemberDTO> members = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = getConnection();

		try {
			String sql = "select id, pw, name, age from member order by id desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				MemberDTO member = new MemberDTO(id, pw, name, age);
				members.add(member);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pstmt, conn);
		}		

		return members;
	}

	// select one
	public MemberDTO getMember(MemberDTO dto) {
		MemberDTO member = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = getConnection();

		try {
			String sql = "select id, pw, name, age from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				member = new MemberDTO(id, pw, name, age);				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pstmt, conn);
		}		

		return member;
	}

	
	// insert
	public int memberInsert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;

		conn = getConnection();

		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			int age = dto.getAge();			

			String sql = "insert into member(id,pw,name,age) values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			rs = pstmt.executeUpdate();
			System.out.println("rs = " + rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}		

		return rs;
	}

	// update
	public int memberUpdate(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;

		conn = getConnection();

		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			int age = dto.getAge();			

			String sql = "update member set pw = ?, name = ?, age = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, id);
			rs = pstmt.executeUpdate();
			System.out.println("rs = " + rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}		

		return rs;
	}

	// delete
	public int memberDelete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;

		conn = getConnection();

		try {
			String id = dto.getId();

			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeUpdate();
			System.out.println("rs = " + rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}		

		return rs;
	}


}




