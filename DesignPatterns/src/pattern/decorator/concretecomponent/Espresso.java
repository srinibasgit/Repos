package pattern.decorator.concretecomponent;

import pattern.decorator.component.Beverage;

/**
 * The ConcreteComponent is the object we’re going to dynamically add new
 * behavior to. It extends Component.
 * 
 * @author spanda
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}

}
