package hotel.servlet.employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.dao.EmployeeDao;
import hotel.model.Employee;
import hotel.model.Inventory;

@WebServlet("/updateEmployee")
public class EmployeeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao EmployeeDao;

	public void init() {
		EmployeeDao = new EmployeeDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		int id = Integer.parseInt(request.getParameter("id"));
		String employeename = request.getParameter("employeename");
		String address = request.getParameter("address");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		String position = request.getParameter("position");
		int Salary = Integer.parseInt(request.getParameter("Salary"));
		String joineddate = (request.getParameter("joineddate"));

		Employee emp = new Employee( id,employeename, address, mobile, position, Salary, joineddate);
		try {
			EmployeeDao.updateEmployee(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listEmployee");
		
	}

	

}