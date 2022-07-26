package pizzeria;
import java.util.*;

public class DIYPizza extends Pizza implements PricedItem
{
	public DIYPizza(PizzaSize size)
	{
		super("DIY Pizza", size, PizzaBase.Original);
	}

	@Override
	public double computePrice()
	{
		double total = 0;
		ArrayList<Topping> toppings = super.getToppings();

		for(Topping topps : toppings)
		{
			total = total + topps.getCost();
		}

		total = total + 100;

		switch(super.getSize())
		{
			case Single:
				total = total * 1;
				break;
			case Double:
				total = total * 2;
				break;
			case Barkada:
				total = total * 5;
				break;

		}

		return total;
	}
}