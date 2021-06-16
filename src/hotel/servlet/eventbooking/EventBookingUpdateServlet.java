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



@WebServlet("/updateEventBook")
public class EventBookingUpdateServlet extends HttpServlet {
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
		String user = request.getParameter("user");
		String nic = request.getParameter("nic");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		String email = request.getParameter("email");
		String eventdate = (request.getParameter("eventdate"));
		String paymentdate = (request.getParameter("paymentdate"));
		int noofhours = Integer.parseInt(request.getParameter("noofhours"));
		int guestmembers = Integer.parseInt(request.getParameter("guestmembers"));
		int advancedPayment = Integer.parseInt(request.getParameter("AdvancedPayment"));
		System.out.println("......................EventsBooking");
		System.out.println("id   :"+id);
		EventBooking ev = new EventBooking( id,user, nic, mobile,email,eventdate,paymentdate,noofhours,guestmembers,advancedPayment);
		
		System.out.println(ev);
		try {
			EventsBookingDao.updateEventbooking(ev);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listEventBook");
	}

	

}