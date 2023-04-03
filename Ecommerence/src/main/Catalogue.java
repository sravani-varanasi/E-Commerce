package main;
import cus.Admin;
public class Catalogue {
	private product[] listOfAllProducts;
	private Admin user;
	public Admin getUser() {
		return user;
	}
	public Admin getuser() {
		return user;
	}
	public void setUser(Admin user) {
		this.user = user;
	}
	public product[] getListOfAllProducts() {
		product product1= new product();
		product1.setProductId("1");
		product1.setProductName("Iphone");
		product1.setCost("145000");
		product product2= new product();
		product2.setProductId("2");
		product2.setProductName("Noise");
		product2.setCost("3400");
		listOfAllProducts= new product[2];
		listOfAllProducts[0]=product1;
		listOfAllProducts[1]=product2;
		return listOfAllProducts;
	}

	public void setListOfAllProducts(product[] listOfAllProducts) {
		this.listOfAllProducts = listOfAllProducts;
	}

}
