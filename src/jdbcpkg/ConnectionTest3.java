package jdbcpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest3 {
	public static void main (String[] args) {
		
		//select member
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 드라이버 클래스 연결
		try {
			// 1. driver loading
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			// 2. connection -> 사용할 database 스키마
			String url = "jdbc:mysql://localhost:3306/kdigital?serverTimezone=UTC"; 
			String user = "root";
			String passworld = "rpass";
			try {
				conn = DriverManager.getConnection(url,user,passworld);
				System.out.println("conn ok!!");
				
				// 3. statement, PreparedStatement
				// 동적으로 입력값 아이디 db 출력
//				Scanner sc = new Scanner(System.in);
//				System.out.println("id > ");
//				int sId = sc.nextInt();
//				String sql = "select id, name, countrycode, district, population from city";
//				sql += " where id = " + sId;
//				System.out.println(sql);
//				stmt = conn.createStatement();
//				stmt.executeQuery(sql);
//				rs = stmt.executeQuery(sql);
//				System.out.println("executeQuery ok!!");
				
				// 정적인 입력값 db출력
//				int sId = 5;
//				String sql = "select id, name, countrycode, district, population from city where id = ?";
//				String sql = "select id, name, countrycode, district, population from city where id = ?";
//				pstmt = conn.prepareStatement(sql);
//				pstmt.setInt(1, sId);
//				rs = pstmt.executeQuery();
				
				// 4. resultset에서 컬럼값 가져오기
//				if (rs.next()) {
//					int id = rs.getInt("id");
//					String name = rs.getString("name");
//					int population = rs.getInt("population");
//					System.out.println(id);
//					System.out.println(name);
//					System.out.println(population);
//				}
				
				String sql = "select id,pw,name,age from member";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				// 4. resultset에서 컬럼값 가져오기
				while (rs.next()) {
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					System.out.printf("%s, %s, %s, %s", id, pw, name, age);
					System.out.println();
				}
				
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
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
