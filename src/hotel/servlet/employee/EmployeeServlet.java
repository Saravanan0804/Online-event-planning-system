//package hotel.servlet.employee;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import hotel.dao.UserDAO;
//import hotel.model.Employee;
//import hotel.model.Inventory;
//
//@WebServlet("/jb")
//public class EmployeeServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private UserDAO userDAO;
//
//	public void init() {
//		userDAO = new UserDAO();
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String action = request.getServletPath();
//
//		try {
//			switch (action) {
//			case "/newEmployee":
//				showNewForm(request, response);
//				break;
//			case "/":
//				insertUser(request, response);
//				break;
//			case "/deleteEmployee":
//				deleteUser(request, response);
//				break;
//			case "/editEmployee":
//				showEditForm(request, response);
//				break;
//			case "/updateEmployee":
//				updateUser(request, response);
//				break;
//			case "/listEmployee":
//				listUser(request, response);
//				break;
//			}
//		} catch (SQLException ex) {
//			throw new ServletException(ex);
//		}
//	}
//
//	private void listUser(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<Employee> listEmployee = userDAO.selectAllEmployee();
//		// System.out.print(listUser);
//		request.setAttribute("listEmployee", listEmployee);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Employlist.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//	}
//
//	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		Employee existingUser = userDAO.selectEmployee(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("AddEmployee.jsp");
//		request.setAttribute("user", existingUser);
//		dispatcher.forward(request, response);
//
//	}
//
//	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//	}
//
//	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String employeename = request.getParameter("employeename");
//		String address = request.getParameter("address");
//		int mobile = Integer.parseInt(request.getParameter("mobile"));
//		String position = request.getParameter("position");
//		int Salary = Integer.parseInt(request.getParameter("Salary"));
//		String joineddate = (request.getParameter("joineddate"));
//
//		Employee emp = new Employee( id,employeename, address, mobile, position, Salary, joineddate);
//		userDAO.updateEmployee(emp);
//		response.sendRedirect("listEmployee");
//	}
//
//	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		userDAO.deleteEmployee(id);
//		response.sendRedirect("listEmployee");
//
//	}
//
//}