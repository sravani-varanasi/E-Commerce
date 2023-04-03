package ord;
import main.product;

public class Cart {
	private String cartId;
    public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	private product[] listOfProducts;
	public product[] getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(product[] listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	public Boolean checkOut() {
		return true;
	}
}
