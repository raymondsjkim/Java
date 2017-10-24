// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
public class ShoppingCart
{
	private int itemCount; // total number of items in the cart
	private double totalPrice; // total price of items in the cart
	private int capacity; // current cart capacity
	private Item[] cart;
	
	// ---------------------------------------------------------
	// Creates an empty shopping cart with a capacity of 5 items.
	// ---------------------------------------------------------
	public ShoppingCart()
	{
		capacity = 5;
		itemCount = 0;
		totalPrice = 0.0;
		cart = new Item[capacity];
	}
	
	// -----------------------------------------------------
	// Adds an item to the shopping cart.
	// -----------------------------------------------------
	public void addToCart(String itemName, double price, int quantity)
	{
		if(itemCount == cart.length) {
			increaseSize();
		}
		cart[itemCount] = new Item(itemName, price, quantity); 
		
		totalPrice = totalPrice + price;
		itemCount++;
	}
	
	// -----------------------------------------------------
	// Returns the contents of the cart together with
	// summary information.
	//-----------------------------------------------------
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";
		contents += "\nItem\tUnit Price\tQuantity\tTotal\n";
		for (int i = 0; i < itemCount; i++) {
			contents += cart[i].toString() + "\n";
			contents += "\nTotal Price: " + fmt.format(totalPrice);
			contents += "\n";
		}
		return contents;
	}
	
	//-----------------------------------------------------
	//Increases the capacity of the shopping cart by 3
	//-----------------------------------------------------
	private void increaseSize()
	{
		Item[] temp = new Item[cart.length + 3];
		for(int itemInCart = 0; itemInCart < cart.length; itemInCart++) {
			temp[itemInCart] = cart[itemInCart];
		}
		cart = temp;
	}
    public boolean shopAgain(Scanner scan)
    {
    	String answer;
      	System.out.print ("Shop again [y/n]? ");
      	answer = scan.next();
      	return (answer.equals("y") || answer.equals("Y"));
    }  // method playAgain
} 
