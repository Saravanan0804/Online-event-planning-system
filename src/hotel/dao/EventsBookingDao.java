package hotel.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import hotel.dbconnection.DbConnection;
import hotel.model.EventBooking;

public class EventsBookingDao {


		// EventsBooking
		private static final String INSERT_evbooking_SQL = "INSERT INTO eventsbooking"
				+ " ( 	User,Nic,mobile,email,eventdate,paymentdate,noofhours,guestmembers,AdvancedPayment) VALUES "
				+ " (?, ?, ?,?,?,?, ?, ?,?);";
		private static final String SELECT_ALL_BookingbyUser = "select * from eventsbooking where User=? ";
		private static final String SELECT_evbooking_BY_ID = "select 	id,User,Nic,mobile,email,eventdate,paymentdate,noofhours,guestmembers,AdvancedPayment from eventsbooking where id =?";
		private static final String SELECT_ALL_evbooking = "select * from eventsbooking";
		private static final String DELETE_evbooking_SQL = "delete from eventsbooking where id = ?;";
		private static final String UPDATE_evbooking_SQL = "update eventsbooking set   User= ?,Nic= ?,mobile= ?,email= ?,eventdate= ?,paymentdate= ?,noofhours= ?,guestmembers= ?,AdvancedPayment= ? where id = ?;";

		public EventsBookingDao() {
		}

		DbConnection dbconnection = new DbConnection();

		// insert EventsBoking
		public void insertEventsBook(EventBooking evbook) throws SQLException {
			System.out.println(INSERT_evbooking_SQL);
			// try-with-resource statement will auto close the connection.
			try (Connection connection = dbconnection.getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_evbooking_SQL)) {
				preparedStatement.setString(1, evbook.getUser());
				preparedStatement.setString(2, evbook.getNic());
				preparedStatement.setInt(3, evbook.getMobile());
				preparedStatement.setString(4, evbook.getEmail());
				preparedStatement.setString(5, evbook.getEventdate());
				preparedStatement.setString(6, evbook.getPaymentdate());
				preparedStatement.setInt(7, evbook.getNoofhours());
				preparedStatement.setInt(8, evbook.getGuestMembers());
				preparedStatement.setInt(9, evbook.getAdvancedPayment());

				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				dbconnection.printSQLException(e);
			}
		}

		// select EventBooking
		public EventBooking selectEventBooking(int id) {
			EventBooking evbook = null;
			// Step 1: Establishing a Connection
			try (Connection connection = dbconnection.getConnection();
					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_evbooking_BY_ID);) {
				preparedStatement.setInt(1, id);
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();

				// Step 4: Process the ResultSet object.
				while (rs.next()) {
					String user = rs.getString("User");
					String nic = rs.getString("Nic");
					int mobile = rs.getInt("mobile");
					String email = rs.getString("email");
					String eventdate = rs.getString("eventdate");
					String paymentdate = rs.getString("paymentdate");
					int noofhours = rs.getInt("noofhours");
					int guestmembers = rs.getInt("guestmembers");
					int advancedPayment = rs.getInt("AdvancedPayment");

					evbook = new EventBooking(id,user, nic, mobile, email, eventdate, paymentdate, noofhours, guestmembers,
							advancedPayment);
				}

			} catch (SQLException e) {
				dbconnection.printSQLException(e);
			}
			return evbook;
		}
		// select All EventBokings
		public List<EventBooking> selectAllEventBookingsByUser(String User) {

			// using try-with-resources to avoid closing resources (boiler plate code)
			List<EventBooking> evbook = new ArrayList<>();
			// Step 1: Establishing a Connection
			try (Connection connection = dbconnection.getConnection();
					
					// Step 2:Create a statement using connection object
					
					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BookingbyUser);) {
				preparedStatement.setString(1, User);
				
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();

				// Step 4: Process the ResultSet object.
				while (rs.next()) {
					int id = rs.getInt("id");
					String user = rs.getString("User");
					String nic = rs.getString("Nic");
					int mobile = rs.getInt("mobile");
					String email = rs.getString("email");
					String eventdate = rs.getString("eventdate");
					String paymentdate = rs.getString("paymentdate");
					int noofhours = rs.getInt("noofhours");
					int guestmembers = rs.getInt("guestmembers");
					int advancedPayment = rs.getInt("AdvancedPayment");
					evbook.add(new EventBooking(id, user, nic, mobile, email, eventdate, paymentdate, noofhours, guestmembers,
							advancedPayment));
				}
			} catch (SQLException e) {
				dbconnection.printSQLException(e);
			}
			return evbook;
		}
		// select All EventBokings
		public List<EventBooking> selectAllEventBookings() {

			// using try-with-resources to avoid closing resources (boiler plate code)
			List<EventBooking> evbook = new ArrayList<>();
			// Step 1: Establishing a Connection
			try (Connection connection = dbconnection.getConnection();

					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_evbooking);) {
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();

				// Step 4: Process the ResultSet object.
				while (rs.next()) {
					int id = rs.getInt("id");
					String user = rs.getString("User");
					String nic = rs.getString("Nic");
					int mobile = rs.getInt("mobile");
					String email = rs.getString("email");
					String eventdate = rs.getString("eventdate");
					String paymentdate = rs.getString("paymentdate");
					int noofhours = rs.getInt("noofhours");
					int guestmembers = rs.getInt("guestmembers");
					int advancedPayment = rs.getInt("AdvancedPayment");
					evbook.add(new EventBooking(id, user, nic, mobile, email, eventdate, paymentdate, noofhours, guestmembers,
							advancedPayment));
				}
			} catch (SQLException e) {
				dbconnection.printSQLException(e);
			}
			return evbook;
		}

		// Delete eventsBook
		public boolean deleteEventsBook(int id) throws SQLException {
			boolean rowDeleted;
			try (Connection connection = dbconnection.getConnection();
					PreparedStatement statement = connection.prepareStatement(DELETE_evbooking_SQL);) {
				statement.setInt(1, id);
				rowDeleted = statement.executeUpdate() > 0;
			}
			return rowDeleted;
		}

		// Update EventBooking
		public boolean updateEventbooking(EventBooking evbook) throws SQLException {
			boolean rowUpdated;
			try (Connection connection = dbconnection.getConnection();
					PreparedStatement statement = connection.prepareStatement(UPDATE_evbooking_SQL);) {
				statement.setString(1, evbook.getUser());
				statement.setString(2, evbook.getNic());
				statement.setInt(3, evbook.getMobile());
				statement.setString(4, evbook.getEmail());

				statement.setString(5, evbook.getEventdate());
				statement.setString(6, evbook.getPaymentdate());
				statement.setInt(7, evbook.getNoofhours());
				
				statement.setInt(8, evbook.getGuestMembers());
				statement.setInt(9, evbook.getAdvancedPayment());

				statement.setInt(10, evbook.getId());
				System.out.println(".............................");
			
				System.out.println("Updating Id this "+ evbook.getAdvancedPayment());
				System.out.println("Updating Id this "+ evbook.getId());
	System.out.println("Update "+statement);
				rowUpdated = statement.executeUpdate() > 0;
			}
			return rowUpdated;
		}

		

	}