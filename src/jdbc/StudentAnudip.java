package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAnudip {
	public static final String url = "jdbc:mysql://localhost:3306/Student";
	public static final String user = "root";
	public static final String password = "Sumit@123";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Driver Not Loaded");
		}
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connected");
			Statement st = con.createStatement();
			String sql = ("insert into student values(233,'raj','Kandivali')");
			System.out.println("record inserted");
			int r = st.executeUpdate(sql);
			System.out.println(r + "Record inserted");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("DB NOt Connected");
		}
	}
}
