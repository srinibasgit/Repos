package pattern.decorator.decorator;

import pattern.decorator.component.Beverage;

/**
 * Decorators implement the same interface or abstract class as the component
 * they are going to decorate
 * 
 * @author spanda
 *
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
