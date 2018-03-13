package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final static String DBNAME = "test"; 
	private final static String URL = "jdbc:mysql://127.0.0.1:3306/" + DBNAME;
	private final static String LOGIN = "root";
	private final static String SENHA = "";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws IOException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, LOGIN, SENHA);
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return conn;
	}
}
