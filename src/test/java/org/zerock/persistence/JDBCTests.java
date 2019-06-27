package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	private String url = 
			"jdbc:mysql://localhost:3306/spring_db?serverTimezone=Asia/Seoul";
		private String uid = "springuser";
		private String upw = "12341234";
		Connection conn = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			log.info(conn);
			
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
