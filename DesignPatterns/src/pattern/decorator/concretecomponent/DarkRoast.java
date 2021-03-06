package pattern.decorator.concretecomponent;

import pattern.decorator.component.Beverage;

/**
 * The ConcreteComponent is the object we�re going to dynamically add new
 * behavior to. It extends Component.
 * 
 * @author spanda
 *
 */
public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "DarkRoast";
	}

	public double cost() {
		return 2.99;
	}

}
