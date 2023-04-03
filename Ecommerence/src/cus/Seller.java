package cus;
import main.product;

public class Seller extends User{
	private product[]productsListed;
	public Boolean verifyUser() {
		return true;
	}
	public product[] getProductsListed() {
		return productsListed;
	}
	public void setProductsListed(product[] productsListed) {
		this.productsListed = productsListed;
	}

}
