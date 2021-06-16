package hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hotel.dbconnection.DbConnection;
import hotel.model.Events;


public class EventsDao {

	// events
	private static final String INSERT_events_SQL = "INSERT INTO events"
			+ " ( eventtype,NoHours,Facilities,CostPerHour,filename,path) VALUES " + " (?, ?, ?,?,?,?);";

	private static final String SELECT_events_BY_ID = "select id,eventtype,NoHours,Facilities,CostPerHour from events where id =?";
	private static final String SELECT_ALL_eevents = "select * from events";
	private static final String DELETE_events_SQL = "delete from events where id = ?;";
	private static final String UPDATE_events_SQL = "update events set   eventtype = ?,NoHours = ?,Facilities = ?,CostPerHour = ?  where id = ?;";

	public EventsDao() {
	}

	DbConnection dbconnection = new DbConnection();

// insert Events
	public void insertEvents(Events event) throws SQLException {
		System.out.println(INSERT_events_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_events_SQL)) {
			preparedStatement.setString(1, event.getEventtype());
			preparedStatement.setInt(2, event.getNohours());
			preparedStatement.setString(3, event.getFacilities());
			preparedStatement.setInt(4, event.getCost());
			preparedStatement.setString(5, event.getFilename());
			preparedStatement.setString(6, event.getPath());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
	}

	// select Event
	public Events selectEvent(int id) {
		Events event = null;
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_events_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String eventtype = rs.getString("eventtype");

				int nohours = rs.getInt("NoHours");
				String facilities = rs.getString("Facilities");
				int cost = rs.getInt("CostPerHour");

				event = new Events(id, eventtype, nohours, facilities, cost);
			}

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return event;
	}

	// select All Events
	public List<Events> selectAllEvents() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Events> events = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_eevents);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String eventtype = rs.getString("eventtype");
				int nohours = rs.getInt("NoHours");
				String facilities = rs.getString("Facilities");
				int cost = rs.getInt("CostPerHour");
				String filename = rs.getString("filename");
				String path = rs.getString("path");
				events.add(new Events(id, eventtype, nohours, facilities, cost, filename, path));
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return events;
	}

	// Delete events
	public boolean deleteEvent(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_events_SQL);) {

			statement.setInt(1, id);
			System.out.println(statement);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	// Update Event
	public boolean updateEvents(Events event) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_events_SQL);) {
			statement.setString(1, event.getEventtype());
			statement.setInt(2, event.getNohours());
			statement.setString(3, event.getFacilities());
			statement.setInt(4, event.getCost());
			statement.setInt(5, event.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

}