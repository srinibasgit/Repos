package pattern.decorator;

import pattern.decorator.component.Beverage;
import pattern.decorator.concretecomponent.DarkRoast;
import pattern.decorator.concretecomponent.Espresso;
import pattern.decorator.concretecomponent.HouseBlend;
import pattern.decorator.decorator.Mocha;
import pattern.decorator.decorator.Soy;
import pattern.decorator.decorator.Whip;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " Rs. " + beverage.cost());
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " Rs. " + beverage2.cost());
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " Rs. " + beverage3.cost());
	}

}
