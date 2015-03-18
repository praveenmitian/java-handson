package com.praveen.jdbc;

//STEP 1. Import required packages
import java.sql.*;

/**
 * This class demonstrate the connection to server jdbc.
 * 
 * @author PRAVEEN
 *
 */
public class JdbcConnection {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	static final String DB_URL = "jdbc:derby:D:\\software\\DerbydataSQL;create=true";

	// Database credentials
	static final String USER = "APP";
	static final String PASS = "";

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "select ADDR,count(NAME) AS count from derbydb2 group by ADDR";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name

				String addr = rs.getString("ADDR");
				int count = rs.getInt("count");

				// Display values
				System.out.print("ADDR: " + addr);
				System.out.println(", COUNT: " + count);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample