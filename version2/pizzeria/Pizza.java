package pizzeria;
import java.util.*;

public abstract class Pizza
{
	private String name;
	private PizzaSize size;
	private PizzaBase base;
	private ArrayList<Topping> toppings;

	public Pizza(String name, PizzaSize size, PizzaBase base)
	{
		this.name = name;
		this.size = size;
		this.base = base;

		this.toppings = new ArrayList<Topping>();
	}

	public String getName()
	{
		return this.name;
	}

	public PizzaSize getSize()
	{
		return this.size;
	}

	public PizzaBase getBase()
	{
		return this.base;
	}

	public void addTopping(Topping topping)
	{
		this.toppings.add(topping);
	}

	public ArrayList<Topping> getToppings()
	{
		return new ArrayList<Topping>(this.toppings);
	}

	public abstract double computePrice();

}