package pattern.decorator.concretecomponent;

import pattern.decorator.component.Beverage;

/**
 * The ConcreteComponent is the object we’re going to dynamically add new
 * behavior to. It extends Component.
 * 
 * @author spanda
 *
 */
public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaf";
	}

	public double cost() {
		return 3.99;
	}

}
