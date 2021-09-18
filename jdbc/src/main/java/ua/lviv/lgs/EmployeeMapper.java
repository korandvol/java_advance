package ua.lviv.lgs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper {
	public static Employee map(ResultSet result) throws SQLException {
		int id = result.getInt("id");
		String fname = result.getString("fname");
		String lname = result.getString("lname");

		return new Employee(id, fname, lname);
	}
}
