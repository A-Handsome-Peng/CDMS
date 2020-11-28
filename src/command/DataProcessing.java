package command;

import java.sql.*;

public class DataProcessing {
	private static boolean connectToDB=false;
	static Statement stmt;
	static String sql;
	static String url="";
	static String user="";
	static String pwd="";
	static Connection conn=null;
	
	public static void InitMSSQLServer() {
		String msurl="jdbc:sqlserver://localhost:1433;DatabaseName=CDMSDB";
		String msuser="sa";
		String mspwd="123456";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("成功加载 MS SQL Server 驱动程序");	
		}catch(ClassNotFoundException e) {
			System.out.println("MS SQL Server 驱动程序加载失败");
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(msurl, msuser, mspwd);
			System.out.println("连接成功");
		} catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
	}
	
	public static void InitMYSQL() {
		String myurl="jdbc:mysql://localhost:3306/document?useSSL=false";
		String myuser="root";
		String mypwd="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动程序");
		} catch (ClassNotFoundException e) {
			System.out.println("MS SQL Server 驱动程序加载失败");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(myurl, myuser, mypwd);
			System.out.println("连接成功");
		} catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
	}
	
	public static boolean updateUserPwd(String id,String password)
	{
		
	}
}