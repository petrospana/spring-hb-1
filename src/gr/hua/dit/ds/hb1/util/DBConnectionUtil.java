package gr.hua.dit.ds.hb1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionUtil {
	
	private static final String URL = "jdbc:mysql://localhost:3308/ergasia";
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String USERNAME = "hbstudent";
	
	private static final String PASSWORD = "changeit";
	
	private static Connection connection = null;
	
	public static Connection openConnection() {
		if (connection != null)
            return connection;
        else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }
	}
	
	
}