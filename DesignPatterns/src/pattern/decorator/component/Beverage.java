package pattern.decorator.component;

/**
 * Each component can be used on its own, or wrapped by a decorator
 * 
 * @author spanda
 *
 */
public abstract class Beverage {

	public abstract double cost();
	
	protected String description = "Unknown Beverage" ;

	public String getDescription() {
		return description;
	}
}
