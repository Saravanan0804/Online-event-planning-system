package hotel.servlet.event;

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
//import hotel.model.Events;
//import hotel.model.Inventory;

//@WebServlet("/m")
//public class EventServlet extends HttpServlet {
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
//			case "/newEvent":
//				showNewForm(request, response);
//				break;
//			case "/insertEvent":
//				insertUser(request, response);
//				break;
//			case "/deleteEvent":
//				deleteUser(request, response);
//				break;
//			case "/editEvent":
//				showEditForm(request, response);
//				break;
//			case "/updateEvent":
//				updateUser(request, response);
//				break;
//			case "/listEvent":
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
//		List<Events> listEvents = userDAO.selectAllEvents();
//		// System.out.print(listUser);
//		request.setAttribute("listEvents", listEvents);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("eventlist.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Newevent.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		Events event = userDAO.selectEvent(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Newevent.jsp");
//		request.setAttribute("user", event);
//		dispatcher.forward(request, response);
//
//	}
//
//	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//
//		String eventtype = request.getParameter("eventtype");
//
//		int nohours = Integer.parseInt(request.getParameter("nohours"));
//		String facilities = request.getParameter("facilities");
//		int cost = Integer.parseInt(request.getParameter("cost"));
//
//		Rooms room = new Rooms(eventtype, nohours, facilities, cost);
//		userDAO.insertEvent(event);
//		response.sendRedirect("listevent");
//	}
//
//	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//
//		String eventtype = request.getParameter("eventtype");
//
//		int nohours = Integer.parseInt(request.getParameter("nohours"));
//		String facilities = request.getParameter("facilities");
//		int cost = Integer.parseInt(request.getParameter("cost"));
//
//		Events event = new Events(id,eventtype, nohours, facilities, cost);
//		userDAO.updateEvent(event);
//		response.sendRedirect("listevent");
//	}
//
//	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		userDAO.deleteEvent(id);
//		response.sendRedirect("listevent");
//
//	}
//
//}}