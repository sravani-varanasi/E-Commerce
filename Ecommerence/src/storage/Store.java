package storage;
import java.util.Scanner;
import cus.Customer;
import main.Catalogue;
import main.product;
import ord.Cart;
public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the ECOMMENCE STORE!");
		System.out.println("Which user are you? 1.Customer 2.Seller 3.Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("Whats's your userId? ");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("Whats's your password? ");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified");
				while (true) {
					System.out.println("Do you want to- 1. view products 2.view Cart 3.Contact Us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						product[] allProducts = catalogue.getListOfAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do you want to add any product to the Cart?Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to cart");
							String productId = sc.nextLine();
							product[] cartProducts = new product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId() == productId) {
									cartProducts[0] = allProducts[i];
								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListOfProducts(cartProducts);
								current.setCart(cart);
								System.out.println("The product is successfully added to the cart");
							}
						} 
						else if (choice == 2) {
							product[] cartProducts = current.getCart().getListOfProducts();
							System.out.println(current.getCart().getListOfProducts());
							for (int i = 0; i < cartProducts.length; i++) {
								System.out.println(cartProducts[i].getProductId() + " "
										+ cartProducts[i].getProductName() + " " + cartProducts[i].getCost());
							}
							System.out.println("Do you want to checkout? Y/N");
							sc.nextLine();
							String checkout = sc.nextLine();
							if (checkout.equals("Y")) {
								if (current.getCart().checkOut()) {
									System.out.println("Your order is placed successfully");
								}
							}
						} 
						else if (choice == 3) {
							System.out.println("To Contact us, please email on store@ecommerce");
						} 
						else if (choice == 4) {
							break;
						} 
						else {
							System.out.println("Invalid choice,please try again.");
						}

					}
	  else if (choice == 2) {
		  typeOfUser = "Seller";
		  System.out.println("Whats's your userId? ");
	      sc.nextLine();
		  System.out.println("Whats's your password? ");
		  sc.nextLine();
	 } 
	 else if (choice == 3) {
		typeOfUser = "Admin";
		System.out.println("Whats's your userId? ");
		sc.nextLine();
		System.out.println("Whats's your password? ");
		sc.nextLine();
		while (true) {
		    System.out.println("Do you want to - 1. view all product 2-contactus");
		    int Choiceadmin = sc.nextInt();
		    if (Choiceadmin == 1) {
		          Catalogue catalogue2 = new Catalogue();
		          product[] Show = catalogue2.getListOfAllProducts();
		          for (int i = 0; i < Show.length; i++) {
		            System.out.println("" + Show[i].getProductId() + "" + Show[i].getProductName() + "" + Show[i].getCost());
		          }
		    } 
		    else {
		    	System.out.println("Contact us =  check****@gmail.com");
		    }
		}

	} 
	else {
		System.out.println("Invalid input.Try again");
	}
	}
	}
    }
	}
}
