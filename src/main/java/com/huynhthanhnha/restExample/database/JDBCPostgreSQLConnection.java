package com.huynhthanhnha.restExample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgreSQLConnection {

	private static final String URL = "jdbc:postgresql://host.docker.internal:49156/mydb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgrespw";
	
	public static Connection connection() {
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
