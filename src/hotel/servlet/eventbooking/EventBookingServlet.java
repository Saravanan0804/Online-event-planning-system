package hotel.servlet.eventbooking;
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
//import hotel.model.EventBooking;
//import hotel.model.Inventory;
//
//
//
//@WebServlet("/b")
//public class EventBookingServlet extends HttpServlet {
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
//			case "/":
//				showNewForm(request, response);
//				break;
//			case "/insertEventBook":
//				insertUser(request, response);
//				break;
//			case "/deleteEventBook":
//				deleteUser(request, response);
//				break;
//			case "/editEventBook":
//				showEditForm(request, response);
//				break;
//			case "/updateBook":
//				updateUser(request, response);
//				break;
//			case "/listventBook":
//				listUser(request, response);
//				break;
//			}
//  			
//		} catch (SQLException ex) {
//			throw new ServletException(ex);
//		}
//	}
//
//	private void listUser(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<EventBooking> listEventBooking = userDAO.selectAllEventBookings();
//		//System.out.print(listUser);
//		request.setAttribute("listEventBooking", listEventBooking);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("EventBookingList.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("NewEventBook.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		EventBooking existingUser = userDAO.selectEventBooking(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("NewEventBook.jsp");
//		request.setAttribute("user", existingUser);
//		dispatcher.forward(request, response);
//
//	}
//
//	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		String user = request.getParameter("user");
//		String nic = request.getParameter("nic");
//		int mobile = Integer.parseInt(request.getParameter("mobile"));
//		String email = request.getParameter("email");
//		String eventdate = (request.getParameter("eventdate"));
//		String paymentdate = (request.getParameter("paymentdate"));
//		int noofhours = Integer.parseInt(request.getParameter("noofhours"));
//		int guestmembers = Integer.parseInt(request.getParameter("guestmembers"));
//		int advancedPayment = Integer.parseInt(request.getParameter("advancedPayment"));
//		
//		EventBooking ev= new EventBooking( user, nic, mobile,email,eventdate,paymentdate,noofhours,guestmembers,advancedPayment);
//		userDAO.insertEventsBook(ev);
//		response.sendRedirect("listEventBooking");
//	}
//
//	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String user = request.getParameter("user");
//		String nic = request.getParameter("nic");
//		int mobile = Integer.parseInt(request.getParameter("mobile"));
//		String email = request.getParameter("email");
//		String eventdate = (request.getParameter("eventdate"));
//		String paymentdate = (request.getParameter("paymentdate"));
//		int noofhours = Integer.parseInt(request.getParameter("noofhours"));
//		int guestmembers = Integer.parseInt(request.getParameter("guestmembers"));
//		int advancedPayment = Integer.parseInt(request.getParameter("advancedPayment"));
//		
//		EventBooking ev = new RoomBooking( id,user, nic, mobile,email,eventdate,paymentdate,noofhours,guestmembers,advancedPayment);
//		userDAO.updateEventbooking(ev);
//		response.sendRedirect("listEventBook");
//	}
//
//	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		userDAO.deleteEventsBook(id);
//		response.sendRedirect("listEventBook");
//
//	}
//
//}}