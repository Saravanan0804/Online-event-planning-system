package hotel.servlet.eventbooking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.dao.EventsBookingDao;

import hotel.model.Employee;
import hotel.model.EventBooking;
import hotel.model.Inventory;



@WebServlet("/editEventBook")
public class EventBookingEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EventsBookingDao EventsBookingDao;
	
	public void init() {
		EventsBookingDao = new EventsBookingDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		int id = Integer.parseInt(request.getParameter("id"));
		EventBooking existingUser = EventsBookingDao.selectEventBooking(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewEventBook.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	

}