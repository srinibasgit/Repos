package pattern.decorator.decorator;

import pattern.decorator.component.Beverage;

/**
 * The ConcreteDecorator has an instance variable for the thing it decorates
 * (the Component the Decorator wraps).
 * 
 * Decorators can extend the state of the component
 * 
 * Decorators can add new methods; however, new behavior is typically added by
 * doing computation before or after an existing method in the component
 * 
 * @author spanda
 *
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .30 + beverage.cost();
	}
}
