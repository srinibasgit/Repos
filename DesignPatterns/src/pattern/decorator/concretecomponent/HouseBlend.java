package pattern.decorator.concretecomponent;

import pattern.decorator.component.Beverage;

/**
 * The ConcreteComponent is the object we’re going to dynamically add new
 * behavior to. It extends Component.
 * 
 * @author spanda
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}
