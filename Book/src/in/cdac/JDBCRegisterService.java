package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCRegisterService {

	private static String url = "jdbc:mysql://localhost:3306/Book?serverTimezone=UTC";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String username = "root";
	private static String password = "Bearishandsome820708";

	public static void registerUser(User user) throws Exception {
		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO JDBC_USER(USERNAME,PASSWORD,EMAIL,MOBILE) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobile());

			ps.executeUpdate();
			return;

		} catch (Exception e) {
			throw e;
		}

	}
}
