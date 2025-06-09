package Day3;

public class ShoppingCart {
	public void add_to_cart(String category,int price)
	{
		System.out.println("Your category: "+category);
		System.out.println("Item Price: "+price);
	}
	public void add_to_cart(String category,int price,int quantity)
	{
		int total=price*quantity;
		System.out.println("Total Amount"+total);
	}
}
class TestShopping
{
	public static void main(String[] args) {
		
	
	ShoppingCart sc=new ShoppingCart();
	sc.add_to_cart("Phone", 10000);
	sc.add_to_cart("Phone", 10000, 2);
	
	}
}
