/*
 * This class creates the program to test the pizzeria classes.
 * It creates a new Restaurant, add Orders by customer, then add Pizzas in the Order with a name, size, and base,
 * and displays all the orders per customer in the restaurant.
 */
import pizzeria.*;

public class TestPizzaBaseRestaurant
{
	public static void main(String[] args)
	{
		PizzaBaseRestaurant restaurant = new PizzaBaseRestaurant();
		Order order;
		String customer;
		Pizza pizza;

		//
		//	Create restaurant orders and ordered pizzas
		//

		System.out.println("Creating the order for customer Lelouch.");
	    restaurant.addOrder("Lelouch", new Order());
	    order = restaurant.getOrder(0);
	    System.out.println("He orders a Single Hawaiian Thincrust pizza and 2 Barkada Size Ham and Cheese Original base pizzas");
	    order.addPizza(new Pizza("Hawaiian", PizzaSize.Single, PizzaBase.Thincrust));
	    order.addPizza(new Pizza("Ham and Cheese", PizzaSize.Barkada, PizzaBase.Original));
	    order.addPizza(new Pizza("Ham and Cheese", PizzaSize.Barkada, PizzaBase.Original));
	    System.out.println();

	    System.out.println("Creating the order for customer Raito.");
	    restaurant.addOrder("Raito", new Order());
	    order = restaurant.getOrder(1);
	    System.out.println("He orders a Double pizza and a Single Thincrust Pepperoni pizza.");
	    order.addPizza(new Pizza(PizzaSize.Double));
	    order.addPizza(new Pizza("Pepperoni", PizzaSize.Single, PizzaBase.Thincrust));
	    System.out.println();

	    System.out.println("Creating the order for customer Hinamori.");
	    restaurant.addOrder("Hinamori", new Order());
	    order = restaurant.getOrder(2);
	    System.out.println("She orders a Single Bluberry pizza, a Single Thincrust Strawberry pizza, and a Double Size Diamond Dust pizza.");
	    order.addPizza(new Pizza("Blueberry", PizzaSize.Single, PizzaBase.Original));
	    order.addPizza(new Pizza("Strawberry", PizzaSize.Single, PizzaBase.Thincrust));
	    order.addPizza(new Pizza("Diamond Dust", PizzaSize.Double, PizzaBase.Original));
	    System.out.println();

	    //
	    //  Display all orders for all customers in the restaurant
	    //

	    for(int i=0; i < restaurant.getTotalNumberOfCustomers(); i++)
	    {
	    	customer = restaurant.getCustomer(i);
	    	order = restaurant.getOrder(i);
	    	System.out.println("Retrieving the customer " + customer + " with his/her orders.");
	    	System.out.println("He/She ordered:");
	    	System.out.println("Name\t\tSize\tBase");
	    	for(int j=0; j < order.getNumOfPizzas(); j++)
	    	{
	    		pizza = order.getPizza(j);
	    		System.out.println(((pizza.getName()==null)? "--No name--":pizza.getName()) + "\t" + pizza.getSize() + "\t" + pizza.getBase());
	    	}
	    	System.out.println();
	    }
	}
}