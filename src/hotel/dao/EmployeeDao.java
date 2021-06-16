package hotel.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import hotel.dbconnection.DbConnection;
import hotel.model.Employee;

public class EmployeeDao {

	DbConnection dbconnection  = new DbConnection();
	// employee
	private static final String INSERT_employe_SQL = "INSERT INTO employees"
			+ " ( employeename,address,mobile,position,Salary,joineddate,filename,path) VALUES " + " (?, ?, ?,?,?,?,?,?);";

	private static final String SELECT_employe_BY_ID = "select id,employeename,address,mobile,position,Salary,joineddate from employees where id =?";
	private static final String SELECT_ALL_employe = "select * from employees";
	private static final String DELETE_employe_SQL = "delete from employees where id = ?;";
	private static final String UPDATE_employe_SQL = "update employees set  employeename = ?,address = ?,mobile = ?,position = ?,Salary = ?,joineddate = ? where id = ?;";

	public EmployeeDao() {
	}

	// insert employee

	public void insertEmployee(Employee emp) throws SQLException {
		System.out.println(INSERT_employe_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_employe_SQL)) {
			preparedStatement.setString(1, emp.getEmployeename());
			preparedStatement.setString(2, emp.getAddress());
			preparedStatement.setInt(3, emp.getMobile());
			preparedStatement.setString(4, emp.getPosition());
			preparedStatement.setInt(5, emp.getSalary());
			preparedStatement.setString(6, emp.getJoineddate());
			preparedStatement.setString(7, emp.getFilename());
			preparedStatement.setString(8, emp.getPath());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
	}

	// select employee
	public Employee selectEmployee(int id) {
		Employee emp = null;
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_employe_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String employeename = rs.getString("employeename");
				String address = rs.getString("address");
				int mobile = rs.getInt("mobile");
				String position = rs.getString("position");
				int Salary = rs.getInt("Salary");
				String joineddate = rs.getString("joineddate");
				
				
				emp = new Employee(id,employeename, address, mobile, position, Salary, joineddate);
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return emp;
	}

	// select All Employees Items

	public List<Employee> selectAllEmployee() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Employee> emp = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_employe);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String employeename = rs.getString("employeename");
				String address = rs.getString("address");
				int mobile = rs.getInt("mobile");
				String position = rs.getString("position");
				int Salary = rs.getInt("Salary");
				String joineddate = rs.getString("joineddate");
				String filename =rs.getString("filename");
				String path = rs.getString("path");
				emp.add(new Employee(id, employeename, address, mobile, position, Salary, joineddate,filename,path));
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return emp;
	}

	// Delete Employee
	public boolean deleteEmployee(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_employe_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	// update employee

	public boolean updateEmployee(Employee emp) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_employe_SQL);) {
			statement.setString(1, emp.getEmployeename());
			statement.setString(2, emp.getAddress());
			statement.setInt(3, emp.getMobile());
			statement.setString(4, emp.getPosition());
			statement.setInt(5, emp.getSalary());
			statement.setString(6, emp.getJoineddate());

			statement.setInt(7, emp.getId());
System.out.println("Update query +"+ statement);
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	

}