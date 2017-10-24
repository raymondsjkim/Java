/*  
  	Program: A Shopping cart
    Author: Raymond Kim
    Class: CSCI 145
    Date: 10/124/2017
    Description: This program simulates a shopping cart
    where a user can enter an item, price, and quantity
    and displays a shopping cart with the description
    and calculation for the total price.
	Exception(s): N/A
*/
import java.util.Scanner;
import java.text.NumberFormat;
public class Shop {

	public static void main(String[] args) {
	      ShoppingCart cart = new ShoppingCart();
	      NumberFormat fmt = NumberFormat.getCurrencyInstance();
	      String itemName;
	      double itemPrice;
	      double totalPrice = 0;
	      int quantity;
	      Scanner scan = new Scanner(System.in);
	      String shopMore = "y";
	    
	      do
	         {
	    	   System.out.println();
	           System.out.print("Enter the name of the item: ");
	           itemName = scan.next();
	           System.out.print("Enter the unit price: ");
	           itemPrice = scan.nextDouble();
	           System.out.print("Enter the quantity: ");
	           quantity = scan.nextInt();
	           // calculate total price
	           totalPrice = totalPrice + (quantity*itemPrice);
	           // pass in user input in to the method
	           cart.addToCart(itemName, itemPrice, quantity);
	           // Print the cart
	           System.out.println(cart);
	           // print the total price
	           System.out.println("Your total is: " + fmt.format(totalPrice));
	           System.out.println();
	           System.out.print("Continue shoppping (y/n)?");
	           shopMore = scan.next();
	          } while (shopMore.equals("y"));
	      
	      System.out.println();
	      System.out.println("Please pay "+ fmt.format(totalPrice));
	}
}
