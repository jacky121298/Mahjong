package database_utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
	
	private static String userName = "user";
	private static String passWord = "password";
	private static String conn = "jdbc:mysql://127.0.0.1/mahjong?useSSL=false";
	// aware that useSSL is set to false now. not very safe (but it doesn't matter)
	
	
	/** Gets connection from DriverManager. Please set user information and connection strings first.
	 * @return DB connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(conn, userName, passWord);  // URL, user, password
	}
	
	/** Sets user name and password for db connection.
	 * @param userName Your user name, String
	 * @param passWord Your Password, String
	 */
	public static void setUserNameAndPassword(String userName, String passWord) {
		DB_Connection.userName = userName.trim();
		DB_Connection.passWord = passWord;
	}
	
	
	/** Sets connection String. Default: to "traveling" database at LocalHost.
	 * @param Conn Connection string.
	 */
	public static void setConnectionString(String Conn) {
		DB_Connection.conn = Conn;
	}
		
}