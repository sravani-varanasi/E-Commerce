package ord;
import cus.Customer;

public class Order {
	private String orderedId;
	private Customer user;

	public String getOrderedId() {
		return orderedId;
	}

	public void setOrderedId(String orderedId) {
		this.orderedId = orderedId;
	
	
	}

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}
	
}
