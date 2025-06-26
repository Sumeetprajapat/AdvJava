package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRetrieveData {
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

			ResultSet rs = st.executeQuery("select * from student");
			while (rs.next()) {
				int rollno = rs.getInt("rollno");
				String name = rs.getString("name");
				String address = rs.getString("address");

				System.out.println(rollno + " " + name + " " + address);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
