package cus;
import ord.Cart;

public class Customer extends User {
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Boolean verifyUser() {
		return true;

	}

}
