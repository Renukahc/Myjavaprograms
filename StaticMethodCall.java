package Assignment1;

public class StaticMethodCall 
{
	static void book()
	{
		int page=20;
		int price=150;
		String name="RHC";
		System.out.println("Number of pages=" +page);
		System.out.println("Book price=" +price);
		System.out.println("Name of book=" +name);
	}
	public static void main(String[] args) 
	{
		System.out.println("Moral story book");
		book();
	}
}
