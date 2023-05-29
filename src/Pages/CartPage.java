package Pages;

public class CartPage {

	public void cart()
	{
		System.out.println("CartPage");

		String name ="cartpageSelectedForCheeryPIck";
		String NameOfPerson ="Aditya123";
		String surName ="Zope";
		int salary = 100;
		String companyName = "Capgemini";
		String designation = "Automation Architect";
	}
	
	public void timeManagement()
	{
		System.out.println("Time Scheduled");
	}

	public void shopping()
	{
		System.out.println("Shopping wishlist");
		System.out.println("Aditya's shopping wishlist");
		System.out.println("Darshana's shopping wishlist");
		System.out.println("Shopping2");
		System.out.println("Shopping3");
	}

	public static void main(String[] args) {
		CartPage c = new CartPage();
		c.cart();
		System.out.println("existing cherrypick successful");
		System.out.println("existing cherrypick succesfully");
	}

}
