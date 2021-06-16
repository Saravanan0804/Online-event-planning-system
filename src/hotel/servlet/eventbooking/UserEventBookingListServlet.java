package hotel.servlet.eventbooking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.dao.EventsBookingDao;

import hotel.model.Employee;
import hotel.model.EventBooking;
import hotel.model.Inventory;



@WebServlet("/listUserEventBook")
public class UserEventBookingListServlet extends HttpServlet {
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
		
		
	Cookie c1[] = request.getCookies();
		
		System.out.println("Cookies get");
		System.out.println(c1[0].getValue());
		String loginuser=c1[0].getValue();
		System.out.println("Request");	
		
		String action = request.getServletPath();
		List<EventBooking> listEventBooking = EventsBookingDao.selectAllEventBookingsByUser(loginuser);
		//System.out.print(listUser);
		request.setAttribute("listEventBooking", listEventBooking);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserEventBookList.jsp");
		dispatcher.forward(request, response);
		
	}

	

}