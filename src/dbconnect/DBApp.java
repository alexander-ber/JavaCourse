package dbconnect;

//import com.mysql.jdbc.Connection;

import java.sql.*;

public class DBApp {	
	public static void main(String[] args) throws SQLException {
		try {
			String url = "jdbc:mysql://localhost/ameed?northwind&user=ameed&password=1313&useSSL=false";
			Connection conn = DriverManager.getConnection(url);
			
			PreparedStatement statement = conn.prepareStatement("select * from courses");
			ResultSet results = statement.executeQuery();
			while(results.next()) {
				int courseId = results.getInt("course_id");
				System.out.println(
					String.format("%-5d|%-20s|%-15s|%-15s|%-15f", 
						courseId,
						results.getString("name"),
						results.getString("lecturer"),
						results.getString("language"),
						results.getDouble("average")
					)
				);
			}
			statement.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
