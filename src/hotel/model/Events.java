package hotel.model;

public class Events {
	public int id;
	public String eventtype;
	public int nohours;
	public String facilities;
	public int cost;
	public String filename;
	public String path;
	public Events(int id, String eventtype, int nohours, String facilities, int cost, String filename, String path) {
		super();
		this.id = id;
		this.eventtype = eventtype;
		this.nohours = nohours;
		this.facilities = facilities;
		this.cost = cost;
		this.filename = filename;
		this.path = path;
	}
	public Events(String eventtype, int nohours, String facilities, int cost, String filename, String path) {
		super();
		this.eventtype = eventtype;
		this.nohours = nohours;
		this.facilities = facilities;
		this.cost = cost;
		this.filename = filename;
		this.path = path;
	}
	
	
	public Events(int id, String eventtype, int nohours, String facilities, int cost) {
		super();
		this.id = id;
		this.eventtype = eventtype;
		this.nohours = nohours;
		this.facilities = facilities;
		this.cost = cost;
	}
	public Events(int id, String eventtype, int nohours, String facilities, int cost, String filename) {
		super();
		this.id = id;
		this.eventtype = eventtype;
		this.nohours = nohours;
		this.facilities = facilities;
		this.cost = cost;
		this.filename = filename;
	}
	public Events(String eventtype, int nohours, String facilities, int cost, String filename) {
		super();
		this.eventtype = eventtype;
		this.nohours = nohours;
		this.facilities = facilities;
		this.cost = cost;
		this.filename = filename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public int getNohours() {
		return nohours;
	}
	public void setNohours(int nohours) {
		this.nohours = nohours;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
