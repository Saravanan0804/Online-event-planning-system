package hotel.servlet.event;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.dao.EventsDao;
import hotel.model.Employee;
import hotel.model.Events;
import hotel.model.Inventory;

@WebServlet("/editevent")
public class EventEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EventsDao EventsDao;

	public void init() {
		EventsDao = new EventsDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		int id = Integer.parseInt(request.getParameter("id"));
		Events event = EventsDao.selectEvent(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Newevent.jsp");
		request.setAttribute("user", event);
		dispatcher.forward(request, response);
		
	}

	

}
