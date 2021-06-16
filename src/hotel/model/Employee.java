package hotel.model;

public class Employee {
	public int id;
	public String employeename;
	public String address;
	public int mobile;
	public String position;
	public int salary;
	public String joineddate;
	public String filename;
	public String path;

	public Employee(int id, String employeename, String address, int mobile, String position, int salary,
			String joineddate) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.address = address;
		this.mobile = mobile;
		this.position = position;
		this.salary = salary;
		this.joineddate = joineddate;
	}

	public Employee(String employeename, String address, int mobile, String position, int salary, String joineddate,
			String filename, String path) {
		super();
		this.employeename = employeename;
		this.address = address;
		this.mobile = mobile;
		this.position = position;
		this.salary = salary;
		this.joineddate = joineddate;
		this.filename = filename;
		this.path = path;
	}

	public Employee(int id, String employeename, String address, int mobile, String position, int salary,
			String joineddate, String filename, String path) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.address = address;
		this.mobile = mobile;
		this.position = position;
		this.salary = salary;
		this.joineddate = joineddate;
		this.filename = filename;
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
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

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		salary = salary;
	}

	public String getJoineddate() {
		return joineddate;
	}

	public void setJoineddate(String joineddate) {
		this.joineddate = joineddate;
	}

}
