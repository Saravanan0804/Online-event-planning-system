package hotel.model;

public class EventBooking {
	public int id;
	public String user;
	public String nic;
	public int mobile;
	public String email;
	public String eventdate;
    public String paymentdate;
	public int noofhours;
    public int guestmembers;
     public int advancedPayment;
	public EventBooking(int id, String user, String nic, int mobile, String email, String eventdate, String paymentdate,
			int noofhours, int guestmembers, int advancedPayment) {
		super();
		this.id = id;
		this.user = user;
		this.nic = nic;
		this.mobile = mobile;
		this.email = email;
		this.eventdate = eventdate;
		this.paymentdate = paymentdate;
		this.noofhours = noofhours;
		this.guestmembers = guestmembers;
		this.advancedPayment = advancedPayment;
	}
	public EventBooking(String user, String nic, int mobile, String email, String eventdate, String paymentdate,
			int noofhours, int guestmembers, int advancedPayment) {
		super();
		this.user = user;
		this.nic = nic;
		this.mobile = mobile;
		this.email = email;
		this.eventdate = eventdate;
		this.paymentdate = paymentdate;
		this.noofhours = noofhours;
		this.guestmembers = guestmembers;
		this.advancedPayment = advancedPayment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setCheckout(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public int getNoofhours() {
		return noofhours;
	}
	public void setNoofhours(int noofhours) {
		this.noofhours = noofhours;
	}
	public int getGuestMembers() {
		return guestmembers;
	}
	public void setGuestMembers(int guestmembers) {
		this.guestmembers = guestmembers;
	}
	public int getAdvancedPayment() {
		return advancedPayment;
	}
	public void setAdvancedPayment(int advancedPayment) {
		this.advancedPayment = advancedPayment;
	}

     
	

}
