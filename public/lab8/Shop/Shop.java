import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
	      ShoppingCart cart = new ShoppingCart();
	      String itemName;
	      double itemPrice;
	      double totalPrice = 0;
	      int quantity;
	      Scanner scan = new Scanner(System.in);
	      String keepShopping = "y";
	    
	      do
	         {
	           System.out.print("Enter the name of the item: ");
	           itemName = scan.next();
	           
	           System.out.print("Enter the unit price: ");
	           itemPrice = scan.nextDouble();
	           
	           System.out.print("Enter the quantity: ");
	           quantity = scan.nextInt();
	           
	           totalPrice +=(quantity*itemPrice);
	           cart.addToCart(itemName, itemPrice, quantity);
	           
	           System.out.println(cart.toString());
	           
	           System.out.println("Continue shoppping (y/n)?");
	           keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));
	      System.out.println("Please pay $"+ totalPrice);
	}
}
