/*
 * This class creates the program to test the pizzeria classes.
 * It creates a new Restaurant, add Orders by customer, then add Pizzas and FruitShakes in the Order,
 * and displays all the orders and its total cost per customer in the restaurant.
 */
import pizzeria.*;
import java.util.*;

public class TestPizzaBaseRestaurant
{
	public static void main(String[] args)
	{
		PizzaBaseRestaurant restaurant = new PizzaBaseRestaurant();
		Order order;
		String customer;
		Pizza pizza;

		Topping[] toppingOptions = new Topping[10];
		PrefabPizza[] prefabPizzas = new PrefabPizza[12];
		DIYPizza diypizza;

		Fruit[] fruitOptions = new Fruit[5];
		FruitShake fruitShake;

		PricedItem pricedItem;

		//
		//	Create topping options for pizza
		//

		toppingOptions[0] = new Topping("Pineapple", 15.12);
		toppingOptions[1] = new Topping("Onions", 10.45);
		toppingOptions[2] = new Topping("Ham", 13.29);
		toppingOptions[3] = new Topping("Olives", 14.77);
		toppingOptions[4] = new Topping("Cheese", 18.60);
		toppingOptions[5] = new Topping("Pork Meat", 16.83);
		toppingOptions[6] = new Topping("Strawberry", 22.57);
		toppingOptions[7] = new Topping("Blueberry", 25.99);
		toppingOptions[8] = new Topping("Yellow Peppers", 15.42);
		toppingOptions[9] = new Topping("Pepperoni", 21.12);

		//
		//	Create pre-fab pizzas
		//
		prefabPizzas[0] = new PrefabPizza("Hawaiaan", PizzaSize.Single, PizzaBase.Original, 100);
		prefabPizzas[1] = new PrefabPizza("Hawaiaan", PizzaSize.Double, PizzaBase.Original, 200);
		prefabPizzas[2] = new PrefabPizza("Hawaiaan", PizzaSize.Barkada, PizzaBase.Original, 500);
		prefabPizzas[3] = new PrefabPizza("Hawaiaan", PizzaSize.Single, PizzaBase.Thincrust, 120);
		prefabPizzas[4] = new PrefabPizza("Hawaiaan", PizzaSize.Double, PizzaBase.Thincrust, 220);
		prefabPizzas[5] = new PrefabPizza("Hawaiaan", PizzaSize.Barkada, PizzaBase.Thincrust, 520);
		for(int i=0; i < 6; i++)
		{
			prefabPizzas[i].addTopping(toppingOptions[0]);
			prefabPizzas[i].addTopping(toppingOptions[1]);
			prefabPizzas[i].addTopping(toppingOptions[2]);
			prefabPizzas[i].addTopping(toppingOptions[3]);
		}

		prefabPizzas[6] = new PrefabPizza("Ham and Cheese", PizzaSize.Single, PizzaBase.Original, 90.09);
		prefabPizzas[7] = new PrefabPizza("Ham and Cheese", PizzaSize.Double, PizzaBase.Original, 179.99);
		prefabPizzas[8] = new PrefabPizza("Ham and Cheese", PizzaSize.Barkada, PizzaBase.Original, 444.44);
		prefabPizzas[9] = new PrefabPizza("Ham and Cheese", PizzaSize.Single, PizzaBase.Thincrust, 99.99);
		prefabPizzas[10] = new PrefabPizza("Ham and Cheese", PizzaSize.Double, PizzaBase.Thincrust, 222.22);
		prefabPizzas[11] = new PrefabPizza("Ham and Cheese", PizzaSize.Barkada, PizzaBase.Thincrust, 555.55);
		for(int i=6; i < 12; i++)
		{
			prefabPizzas[i].addTopping(toppingOptions[1]);
			prefabPizzas[i].addTopping(toppingOptions[2]);
			prefabPizzas[i].addTopping(toppingOptions[4]);
		}

		//
		//	Create restaurant orders and ordered pizzas
		//
		fruitOptions[0] = new Fruit("Mango", 17.45);
		fruitOptions[1] = new Fruit("Sweetcorn", 7.79);
		fruitOptions[2] = new Fruit("Coconut", 4.51);
		fruitOptions[3] = new Fruit("Strawberry", 19.99);
		fruitOptions[4] = new Fruit("Pineapple", 14.62);

		//
		//	Create restaurant orders and ordered pizzas
		//

		System.out.println("Creating the order for customer Lelouch.");
	    restaurant.addOrder("Lelouch", new Order());
	    order = restaurant.getOrder(0);
	    System.out.println("He orders a Single Hawaiian Thincrust pizza, 2 Barkada Size Ham and Cheese Original base pizzas, and 5 large Mango fruit shakes");
	    order.addPricedItem(prefabPizzas[3]);
	    order.addPricedItem(prefabPizzas[8]);
	    order.addPricedItem(prefabPizzas[8]);
	    fruitShake = new FruitShake(ShakeSize.Large);
	    fruitShake.addFruit(fruitOptions[0]);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    System.out.println();

	    System.out.println("Creating the order for customer Raito.");
	    restaurant.addOrder("Raito", new Order());
	    order = restaurant.getOrder(1);
	    System.out.println("He orders a Double size DIYPizza with Ham, Pork meat, and Onions, a Single DIYPizza with Pepperoni, Onions, Pork meat, and Yellow peppers, a small Sweetcorn with Coconut fruit shake, and a medium Mango Pineapple fruit shake.");
	    diypizza = new DIYPizza(PizzaSize.Double);
	    diypizza.addTopping(toppingOptions[1]);
	    diypizza.addTopping(toppingOptions[2]);
	    diypizza.addTopping(toppingOptions[5]);
	    order.addPricedItem(diypizza);
	    diypizza = new DIYPizza(PizzaSize.Single);
	    diypizza.addTopping(toppingOptions[1]);
	    diypizza.addTopping(toppingOptions[5]);
	    diypizza.addTopping(toppingOptions[8]);
	    diypizza.addTopping(toppingOptions[9]);
	    order.addPricedItem(diypizza);
	    fruitShake = new FruitShake(ShakeSize.Small);
	    fruitShake.addFruit(fruitOptions[1]);
	    fruitShake.addFruit(fruitOptions[2]);
	    order.addPricedItem(fruitShake);
	    fruitShake = new FruitShake(ShakeSize.Medium);
	    fruitShake.addFruit(fruitOptions[0]);
	    fruitShake.addFruit(fruitOptions[4]);
	    order.addPricedItem(fruitShake);
	    System.out.println();

	    System.out.println("Creating the order for customer Hinamori.");
	    restaurant.addOrder("Hinamori", new Order());
	    order = restaurant.getOrder(2);
	    System.out.println("She orders a Single DIYPizza with Bluberry, Onions, and Olives, a Single DIYPizza with Strawberry, Ham, and Olives, a Double DIYPizza with Pineapple, Onions, Yellow Peppers, and Cheese, and 5 medium strawberry shakes.");
	    diypizza = new DIYPizza(PizzaSize.Single);
	    diypizza.addTopping(toppingOptions[1]);
	    diypizza.addTopping(toppingOptions[3]);
	    diypizza.addTopping(toppingOptions[7]);
	    order.addPricedItem(diypizza);
	    diypizza = new DIYPizza(PizzaSize.Single);
	    diypizza.addTopping(toppingOptions[2]);
	    diypizza.addTopping(toppingOptions[3]);
	    diypizza.addTopping(toppingOptions[6]);
	    order.addPricedItem(diypizza);
	    diypizza = new DIYPizza(PizzaSize.Double);
	    diypizza.addTopping(toppingOptions[0]);
	    diypizza.addTopping(toppingOptions[1]);
	    diypizza.addTopping(toppingOptions[4]);
	    diypizza.addTopping(toppingOptions[8]);
	    order.addPricedItem(diypizza);
	    fruitShake = new FruitShake(ShakeSize.Medium);
	    fruitShake.addFruit(fruitOptions[3]);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
	    order.addPricedItem(fruitShake);
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
	    	
	    	for(int j=0; j < order.getNumOfPricedItems(); j++)
	    	{
	    		pricedItem = order.getPricedItem(j);
	    		double price = pricedItem.computePrice();
	    		if(pricedItem instanceof PrefabPizza)
	    		{
	    			pizza = (PrefabPizza)pricedItem;
	    			System.out.println(pizza.getSize() + " " + pizza.getBase() + " " + pizza.getName() + " - " + String.format("%.2f", price));
	    		}
	    		else if(pricedItem instanceof DIYPizza)
	    		{
	    			pizza = (DIYPizza)pricedItem;
	    			System.out.println(pizza.getSize() + " " + pizza.getName() + " - " + String.format("%.2f", price));
	    			ArrayList<Topping> toppings = pizza.getToppings();
	    			for(Topping t : toppings)
	    				System.out.println("\t-" + t.getName());
	    		}
	    		else if(pricedItem instanceof FruitShake)
	    		{
	    			fruitShake = (FruitShake)pricedItem;
	    			System.out.println(fruitShake.getSize() + " Fruit Shake - " + String.format("%.2f", price));
	    			ArrayList<Fruit> fruits = fruitShake.getFruits();
	    			for(Fruit f : fruits)
	    				System.out.println("\t-" + f.getName());
	    		}
	    	}

	    	System.out.println();
	    	System.out.println("***Total cost: " + String.format("%.2f", order.computeTotalPayment()));
	    	System.out.println();
	    	System.out.println();
	    }
	}
}