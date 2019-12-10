package com.softtek.java.examen.programa6;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Programa6ConexionDB {
	private Programa6ConexionDB() {
		
	}
	
	private static BasicDataSource dbs;
	static {
		dbs= new BasicDataSource();
		dbs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dbs.setUsername("mydb");
		dbs.setPassword("mydb");
		dbs.setUrl("jdbc:mysql://localhost:3306/mydb");
				
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn= dbs.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
