package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		EmployeeDao employeeDao = new EmployeeDao(ConnectionUtils.openConnection());
		// READ ALL
		employeeDao.readAll().stream().forEach(System.out::println);

		System.out.println("----------------------------------------------");
		List<Employee> lstEmp = new ArrayList<>();
		lstEmp.add(new Employee("Tom", "Cruise"));
		lstEmp.add(new Employee("Jim", "Beam"));
		lstEmp.add(new Employee("Shaun", "Connery"));
		lstEmp.add(new Employee("Paul", "Wall"));
		lstEmp.add(new Employee("Notorious", "Big"));

		// INSERT
		lstEmp.forEach(employee -> {
			try {
				employeeDao.insert(employee);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		employeeDao.readAll().stream().forEach(System.out::println);
		System.out.println("----------------------------------------------");

		// READ BY ID
		Employee employeeFromDB = employeeDao.read(6);
		System.out.println(employeeFromDB);

		// UPDATE BY ID
		employeeFromDB.setLname(employeeFromDB.getLname() + "-Combs");
		employeeDao.update(employeeFromDB);

		// READ BY ID
		employeeFromDB = employeeDao.read(6);
		System.out.println(employeeFromDB);
		// READ ALL
		employeeDao.readAll().stream().forEach(System.out::println);

		// DELETE BY ID

		employeeDao.delete(6);
		// READ ALL
		employeeDao.readAll().stream().forEach(System.out::println);
	}
}
