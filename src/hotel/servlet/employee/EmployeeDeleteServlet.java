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

@WebServlet("/deleteEmployee")
public class EmployeeDeleteServlet extends HttpServlet {
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
		try {
			EmployeeDao.deleteEmployee(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listEmployee");
		
	}

	

}