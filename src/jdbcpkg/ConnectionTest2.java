package jdbcpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {
	public static void main (String[] args) {
		
		// insert, update, delete
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert할때는 결과표시를 안보여줘도 되기때문에  resultset 생략가능하다
		int rs = 0;
		// 드라이버 클래스 연결
		try {
			// 1. driver loading
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			
			// 2. connection -> 사용할 database name : world 주의 
			String url = "jdbc:mysql://localhost:3306/kdigital?serverTimezone=UTC"; 
			String user = "root";
			String passworld = "rpass";
			try {
				conn = DriverManager.getConnection(url,user,passworld);
				System.out.println("conn ok!!");
				
				// 3. statement, PreparedStatement
				// insert
//				1. String sql = "insert into member (id,pw,name,age) values ('hong2','2222','홍길동2',22)";
				
				// insert 2, update 할떄 넣을 값들
				String id = "hong3";
				String pw = "3333";
				String name = "홍길동3";
				int age = 33;
				
//				String sql = "insert into member (id,pw,name,age) values (?,?,?,?)";
//				pstmt = conn.prepareStatement(sql);
//				pstmt.setString(1, id);
//				pstmt.setString(2, pw);
//				pstmt.setString(3, name);
//				pstmt.setInt(4, age);
				
				// excuteUpadte() = 값 대입
//				rs = pstmt.executeUpdate();
//				System.out.println("rs = " + rs);
				
				// update
//				String sql = "update member set pw = ?, name = ?, age = ? where id = ?";
//				pstmt = conn.prepareStatement(sql);
//				pstmt.setString(1, pw);
//				pstmt.setString(2, name);
//				pstmt.setInt(3, age);
//				pstmt.setString(4, id);
//				
//				// excuteUpadte() = 값 대입
//				rs = pstmt.executeUpdate();
//				System.out.println("rs = " + rs);
				
				// delete
				String sql = "delete from member where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				// excuteUpadte() = 값 대입
				rs = pstmt.executeUpdate();
				System.out.println("rs = " + rs);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 역순으로 닫아줘야함
//				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
